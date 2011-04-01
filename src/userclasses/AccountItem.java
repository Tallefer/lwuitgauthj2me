/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import TokenGenerator.ITokenGen;
import com.sun.lwuit.Container;
import com.sun.lwuit.events.ActionListener;

/**
 *
 * @author rafael
 */
public class AccountItem {

    ITokenGen tokenGen;
    IAccountItemObserver observer;
    Account acc;
    AccountItemComponent itemComponent;

    public AccountItem(Account acc, ITokenGen tokenGen, IAccountItemObserver observer) {
        this.acc = acc;
        this.tokenGen = tokenGen;
        this.observer = observer;
        tokenGen.setKey(acc.getSecretKey());
        itemComponent = new AccountItemComponent(acc.getAccountName(), "---------");
    }

    public void updateTokenKey() {
        itemComponent.setTokenKey(tokenGen.GenToken());
    }

    public void delete() {
        itemComponent.delete();
        observer.deleted(this);
    }
    
    public Container getAccountItemComponent(){
        return itemComponent;
    }

    public String getSecretKey(){
        return acc.getSecretKey();
    }

    public void setSecretKey(String secretKey){
        acc.setSecretKey(secretKey);
        changed();
    }

    public String getAccountName(){
        return acc.getAccountName();
    }

    public void setAccountName(String accountName){
        acc.setAccountName(accountName);
        changed();
    }


    public void setActionListener(ActionListener actionlistener) {
        itemComponent.setActionListener(actionlistener);
    }

    private void changed(){
        if (observer != null) {
            observer.changed();
        }
    }
}
