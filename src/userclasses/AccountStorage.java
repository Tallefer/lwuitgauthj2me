/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userclasses;

/**
 *
 * @author rafael
 */
public class AccountStorage implements IAccountStorage {
Account[] accArray;


    public void saveAccounts(Account[] accountArray) {
        accArray = accountArray;
    }

    public Account[] retrieveAccounts() {
        return accArray == null ? new Account[0] : accArray;
    }



}
