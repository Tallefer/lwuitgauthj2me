/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userclasses;

/**
 *
 * @author rafael
 */
public class Account {
   private String accountName;
   private String secretKey;

    public Account(String account, String secretKey) {
        this.accountName = account;
        this.secretKey = secretKey;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String account) {
        this.accountName = account;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
