/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userclasses;

/**
 *
 * @author rafael
 */
public interface IAccountItemObserver {

    public void changed();
    public void deleted(AccountItem accItem);

}
