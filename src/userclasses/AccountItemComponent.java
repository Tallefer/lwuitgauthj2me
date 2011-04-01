/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.sun.lwuit.Button;
import com.sun.lwuit.Container;
import com.sun.lwuit.Display;
import com.sun.lwuit.Label;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.Image;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;


/**
 *
 * @author rafael
 */
public class AccountItemComponent extends Container {

    String key;
    String account;
    String secret;
    Container main;
    Label icon;
    Button btKey;
    Label lbAccount;

    public AccountItemComponent(String accountName, String tokenKey) {
        account = accountName;
        key = tokenKey;

        setLayout(new BorderLayout());

        icon = new Label();
        try {
            icon.setIcon(Image.createImage("/lock.png"));
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        addComponent(BorderLayout.WEST, icon);
        Container innerContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        btKey = new Button();
        btKey.setUIID("LabelKey");
        btKey.setText(key);
        btKey.setFocusable(false);

        innerContainer.addComponent(btKey);
        lbAccount = new Label();
        lbAccount.setUIID("Label");
        lbAccount.setText(account);
        innerContainer.addComponent(lbAccount);
        addComponent(BorderLayout.CENTER,innerContainer);
        setFocusable(true);
        setUIID("AccountItem");
        setLeadComponent(btKey);
    }

    public void setTokenKey(String key){
        btKey.setText(key);
    }

    public void setAccountName(String name){
        lbAccount.setText(name);
    }

    public void setActionListener(ActionListener actionlistener){
        if (btKey != null){
        btKey.addActionListener(actionlistener);
        }
    }

    public void delete(){
        this.getParent().removeComponent(this);

    }
}
