/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import TokenGenerator.ITokenGen;
import TokenGenerator.TokenGen;
import com.sun.lwuit.Container;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

/**
 *
 * @author rafael
 */
public class AccountManager implements IAccountItemObserver {

    private StateMachine gui;
    private Container accountContainer;
    private IAccountStorage accStor;
    private ITokenGen tokenGen;
    private Vector accounts;
    private Timer updateKeysTimer;

    public AccountManager(StateMachine gui, Container accountContainer, IAccountStorage accountStorage) {
        this.gui = gui;
        this.accountContainer = accountContainer;
        this.accStor = accountStorage;

        accounts = new Vector();
        loadAccounts();

        updateKeysTimer = new Timer();
        updateKeysTimer.schedule(new updateKeysTask(), 0, 30000);
        updateKeys();

    }

    private void createAccount(Account acc) {
        AccountItem newItem = new AccountItem(acc, new TokenGen(),this);
        newItem.setActionListener(new ComponentActionListener(newItem));
        accounts.addElement(newItem);
    }

    private void loadAccounts() {
        if (accStor != null) {
            Account[] array = accStor.retrieveAccounts();
            for (int i = 0; i < array.length; i++) {
                createAccount(array[i]);
            }
            fillContainer();
        }
    }

    private void saveAccounts(){
        if (accStor != null){
            Account[] array = new Account[accounts.size()];
            for (int i=0;i< accounts.size();i++){
                array[i] = ((AccountItem) accounts.elementAt(i)).acc;
            }
            accStor.saveAccounts(array);
        }
    }

    public void addAccount(Account acc) {
        createAccount(acc);
        fillContainer();
        saveAccounts();
    }

    void fillContainer(Container container) {
        accountContainer = container;
        fillContainer();
    }

    void fillContainer() {
        accountContainer.removeAll();
        for (int i = 0; i < accounts.size(); i++) {
            accountContainer.addComponent(((AccountItem) accounts.elementAt(i)).getAccountItemComponent());
        }
    }

    private void updateKeys() {
        Thread t = new Thread(new Runnable() {

            public void run() {
                AccountItem account;
                for (int i = 0; i < accounts.size(); i++) {
                    account = (AccountItem) accounts.elementAt(i);
                    account.updateTokenKey();
                }
            }
        });
        t.start();
    }

    public void changed() {
        saveAccounts();
    }

    public void deleted(AccountItem accItem) {
        accounts.removeElement(accItem);
        saveAccounts();
    }


    private class ComponentActionListener implements ActionListener {

        AccountItem accItem;

        public ComponentActionListener(AccountItem accItem) {
            this.accItem = accItem;
        }

        public void actionPerformed(ActionEvent ae) {
            gui.setCurAcc(accItem);
            gui.showForm("EditAccount", null);
        }
    }

    private class updateKeysTask extends TimerTask {

        public final void run() {
            updateKeys();
        }
    }
}
