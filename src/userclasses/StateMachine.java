/**
 * Your application code goes here
 */
package userclasses;

import generated.StateMachineBase;
import com.sun.lwuit.*;
import com.sun.lwuit.events.*;
import java.util.Hashtable;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {

    AccountManager accMan;
    AccountItem curAcc;
    AccountStorage accStorBackup;
    IAccountStorage accStor;
    Form main;

    public StateMachine(String resFile) {
        super(resFile);

        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars() {
        accStorBackup = new AccountStorage();
    }

    public void initAccountManager(IAccountStorage accountStorage) {
        accStor = accountStorage;
        initAccountManager();
    }

    protected void initAccountManager() {
        Container mainMenu = findAccounts(main);
        if (accStor == null) {
            accMan = new AccountManager(this, mainMenu, accStorBackup);
        } else {
            accMan = new AccountManager(this, mainMenu, accStor);
        }

    }

    protected void beforeGoogleAuthenticatorJ2ME(Form f) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        super.beforeGoogleAuthenticatorJ2ME(f);
        main = f;
        initAccountManager();

    }

    protected void onGoogleAuthenticatorJ2MEList_ListAction(Component c, ActionEvent event) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        super.onGoogleAuthenticatorJ2MEList_ListAction(c, event);
        List list = findList(Display.getInstance().getCurrent());
        Hashtable ht = (Hashtable) list.getSelectedItem();
        String accountName = (String) ht.get("AccountName");

        System.out.print(accountName);

        showForm("EditAccount", null);

        TextField txtFieldAcc = findTextFieldAccountName(Display.getInstance().getCurrent());
        txtFieldAcc.setText(accountName);

    }

    protected void onGoogleAuthenticatorJ2ME_Button3Action(Component c, ActionEvent event) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        super.onGoogleAuthenticatorJ2ME_Button3Action(c, event);

    }

    protected boolean onEditAccountDeleteAccount() {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        boolean val = super.onEditAccountDeleteAccount();
        main.show();
//        showForm("GoogleAuthenticatorJ2ME", null);
        if (curAcc != null) {
            curAcc.delete();
        }

        return val;
    }

    public void setCurAcc(AccountItem item) {
        curAcc = item;
    }

    protected void beforeEditAccount(Form f) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        super.beforeEditAccount(f);
        if (curAcc != null) {
            findTextFieldAccountName(f).setText(curAcc.getAccountName());
        }
    }

    protected boolean onNewAccountCreateAccount() {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        boolean val = super.onNewAccountCreateAccount();
        Form current = Display.getInstance().getCurrent();
        if (current != null) {
            String accName = findTextFieldAccountName(current).getText();
            String secretKey = findTextFieldKey(current).getText();
            Account newAccount = new Account(accName, secretKey);
            accMan.addAccount(newAccount);
        }
        return false;
    }

    protected boolean onEditAccountSave() {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        boolean val = super.onEditAccountSave();
        Form current = Display.getInstance().getCurrent();
        if (current != null && curAcc != null) {
            String accName = findTextFieldAccountName(current).getText();
            curAcc.setAccountName(accName);
        }
        return val;
    }
}
