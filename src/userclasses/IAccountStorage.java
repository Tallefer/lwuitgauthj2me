/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userclasses;

/**
 *
 * @author rafael
 */
public interface IAccountStorage {
    
    public void saveAccounts(Account[] accountArray);

    public Account[] retrieveAccounts();
}
