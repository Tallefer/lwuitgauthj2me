/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.sun.lwuit.Button;
import com.sun.lwuit.Container;
import com.sun.lwuit.Label;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.Image;
import com.sun.lwuit.animations.AnimationObject;
import com.sun.lwuit.animations.Timeline;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.util.Resources;
import org.bouncycastle.asn1.cms.Time;


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
    Timeline animatedIcon;

    public AccountItemComponent(String accountName, String tokenKey) {
        account = accountName;
        key = tokenKey;

        setLayout(new BorderLayout());

        icon = new Label();
        try {

//            Timeline t = Timeline.createTimeline(30, null, new Dimension(32,32));
//            AnimationObject ao = AnimationObject.createAnimationImage(i, 0, 0);
//            ao.defineOpacity(AnimationObject.MOTION_TYPE_LINEAR, 0,1, 255, 255);
            Resources res = Resources.open("/LWUIT.res");
            Image i = res.getImage("AnimatedPadKey");
            Timeline template = (Timeline) i;
            AnimationObject[] animations = new AnimationObject[template.getAnimationCount()];
            for (int x = 0; x < template.getAnimationCount(); x++){
                animations[x] = template.getAnimation(x);
            }
            animatedIcon = Timeline.createTimeline(template.getDuration(), animations, template.getSize());
            icon.setIcon(animatedIcon);
            
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
    
    public void setTimeTillNextKeyUpdate(int ms){
        animatedIcon.setTime((int) AccountManager.KeyUpdateIntervall - ms);
    }
}
