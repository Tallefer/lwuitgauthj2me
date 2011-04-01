/**
 * This class contains generated code from the LWUIT resource editor, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://lwuit.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.sun.lwuit.*;
import com.sun.lwuit.util.*;
import com.sun.lwuit.plaf.*;
import com.sun.lwuit.events.*;

public abstract class StateMachineBase extends UIBuilder {
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars() {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.open(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            return showForm("GoogleAuthenticatorJ2ME", null);
        } else {
            Form f = (Form)createContainer(resPath, "GoogleAuthenticatorJ2ME");
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.open(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "GoogleAuthenticatorJ2ME");
    }

    protected void initTheme(Resources res) {
            UIManager.getInstance().setThemeProps(res.getTheme(res.getThemeResourceNames()[0]));
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.sun.lwuit.Container findContainer4(Container root) {
        return (com.sun.lwuit.Container)findByName("Container4", root);
    }

    public com.sun.lwuit.Container findContainer3(Container root) {
        return (com.sun.lwuit.Container)findByName("Container3", root);
    }

    public com.sun.lwuit.Container findContainer2(Container root) {
        return (com.sun.lwuit.Container)findByName("Container2", root);
    }

    public com.sun.lwuit.Container findContainer1(Container root) {
        return (com.sun.lwuit.Container)findByName("Container1", root);
    }

    public com.sun.lwuit.Button findKey(Container root) {
        return (com.sun.lwuit.Button)findByName("Key", root);
    }

    public com.sun.lwuit.Button findButtonAbout(Container root) {
        return (com.sun.lwuit.Button)findByName("ButtonAbout", root);
    }

    public com.sun.lwuit.Container findMainMenu(Container root) {
        return (com.sun.lwuit.Container)findByName("MainMenu", root);
    }

    public com.sun.lwuit.Form findNewAccount(Container root) {
        return (com.sun.lwuit.Form)findByName("NewAccount", root);
    }

    public com.sun.lwuit.Button findButton3(Container root) {
        return (com.sun.lwuit.Button)findByName("Button3", root);
    }

    public com.sun.lwuit.Container findAccountItemSelected(Container root) {
        return (com.sun.lwuit.Container)findByName("AccountItemSelected", root);
    }

    public com.sun.lwuit.TextArea findTextArea(Container root) {
        return (com.sun.lwuit.TextArea)findByName("TextArea", root);
    }

    public com.sun.lwuit.Form findGoogleAuthenticatorJ2ME(Container root) {
        return (com.sun.lwuit.Form)findByName("GoogleAuthenticatorJ2ME", root);
    }

    public com.sun.lwuit.Button findButton(Container root) {
        return (com.sun.lwuit.Button)findByName("Button", root);
    }

    public com.sun.lwuit.Label findLabel2(Container root) {
        return (com.sun.lwuit.Label)findByName("Label2", root);
    }

    public com.sun.lwuit.Button findButtonCreateAccount(Container root) {
        return (com.sun.lwuit.Button)findByName("ButtonCreateAccount", root);
    }

    public com.sun.lwuit.Dialog findAbout(Container root) {
        return (com.sun.lwuit.Dialog)findByName("About", root);
    }

    public com.sun.lwuit.TextField findTextFieldAccountName(Container root) {
        return (com.sun.lwuit.TextField)findByName("TextFieldAccountName", root);
    }

    public com.sun.lwuit.List findList(Container root) {
        return (com.sun.lwuit.List)findByName("List", root);
    }

    public com.sun.lwuit.Container findContainer(Container root) {
        return (com.sun.lwuit.Container)findByName("Container", root);
    }

    public com.sun.lwuit.Container findAccounts(Container root) {
        return (com.sun.lwuit.Container)findByName("Accounts", root);
    }

    public com.sun.lwuit.TextField findTextFieldKey(Container root) {
        return (com.sun.lwuit.TextField)findByName("TextFieldKey", root);
    }

    public com.sun.lwuit.Form findEditAccount(Container root) {
        return (com.sun.lwuit.Form)findByName("EditAccount", root);
    }

    public com.sun.lwuit.Button findButtonDeleteAccount(Container root) {
        return (com.sun.lwuit.Button)findByName("ButtonDeleteAccount", root);
    }

    public com.sun.lwuit.Form findEmptyScreen(Container root) {
        return (com.sun.lwuit.Form)findByName("EmptyScreen", root);
    }

    public com.sun.lwuit.Container findAccountItem(Container root) {
        return (com.sun.lwuit.Container)findByName("AccountItem", root);
    }

    public com.sun.lwuit.Button findButtonExit(Container root) {
        return (com.sun.lwuit.Button)findByName("ButtonExit", root);
    }

    public com.sun.lwuit.Label findAccountName(Container root) {
        return (com.sun.lwuit.Label)findByName("AccountName", root);
    }

    public com.sun.lwuit.Label findLabel(Container root) {
        return (com.sun.lwuit.Label)findByName("Label", root);
    }

    public com.sun.lwuit.Form findGoogleAuthenticatorJ2MEList(Container root) {
        return (com.sun.lwuit.Form)findByName("GoogleAuthenticatorJ2MEList", root);
    }

    public com.sun.lwuit.Label findIcon(Container root) {
        return (com.sun.lwuit.Label)findByName("Icon", root);
    }

    public com.sun.lwuit.Button findButtonNewAccount(Container root) {
        return (com.sun.lwuit.Button)findByName("ButtonNewAccount", root);
    }

    public static final int COMMAND_EditAccountAbort = 21;
    public static final int COMMAND_GoogleAuthenticatorJ2MEExit = 24;
    public static final int COMMAND_EditAccountDeleteAccount = 16;
    public static final int COMMAND_AccountItem123456 = 10;
    public static final int COMMAND_EditAccountSave = 22;
    public static final int COMMAND_GoogleAuthenticatorJ2MEListNewAccount = 13;
    public static final int COMMAND_AboutBack = 25;
    public static final int COMMAND_NewAccountCreateAccount = 19;
    public static final int COMMAND_GoogleAuthenticatorJ2MENewAccount = 23;
    public static final int COMMAND_GoogleAuthenticatorJ2MEListBeenden = 5;
    public static final int COMMAND_GoogleAuthenticatorJ2MEListAbout = 4;
    public static final int COMMAND_NewAccountAbort = 18;

    protected boolean onEditAccountAbort() {
        return false;
    }

    protected boolean onGoogleAuthenticatorJ2MEExit() {
        return false;
    }

    protected boolean onEditAccountDeleteAccount() {
        return false;
    }

    protected boolean onAccountItem123456() {
        return false;
    }

    protected boolean onEditAccountSave() {
        return false;
    }

    protected boolean onGoogleAuthenticatorJ2MEListNewAccount() {
        return false;
    }

    protected boolean onAboutBack() {
        return false;
    }

    protected boolean onNewAccountCreateAccount() {
        return false;
    }

    protected boolean onGoogleAuthenticatorJ2MENewAccount() {
        return false;
    }

    protected boolean onGoogleAuthenticatorJ2MEListBeenden() {
        return false;
    }

    protected boolean onGoogleAuthenticatorJ2MEListAbout() {
        return false;
    }

    protected boolean onNewAccountAbort() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_EditAccountAbort:
                if(onEditAccountAbort()) {
                    ev.consume();
                }
                return;

            case COMMAND_GoogleAuthenticatorJ2MEExit:
                if(onGoogleAuthenticatorJ2MEExit()) {
                    ev.consume();
                }
                return;

            case COMMAND_EditAccountDeleteAccount:
                if(onEditAccountDeleteAccount()) {
                    ev.consume();
                }
                return;

            case COMMAND_AccountItem123456:
                if(onAccountItem123456()) {
                    ev.consume();
                }
                return;

            case COMMAND_EditAccountSave:
                if(onEditAccountSave()) {
                    ev.consume();
                }
                return;

            case COMMAND_GoogleAuthenticatorJ2MEListNewAccount:
                if(onGoogleAuthenticatorJ2MEListNewAccount()) {
                    ev.consume();
                }
                return;

            case COMMAND_AboutBack:
                if(onAboutBack()) {
                    ev.consume();
                }
                return;

            case COMMAND_NewAccountCreateAccount:
                if(onNewAccountCreateAccount()) {
                    ev.consume();
                }
                return;

            case COMMAND_GoogleAuthenticatorJ2MENewAccount:
                if(onGoogleAuthenticatorJ2MENewAccount()) {
                    ev.consume();
                }
                return;

            case COMMAND_GoogleAuthenticatorJ2MEListBeenden:
                if(onGoogleAuthenticatorJ2MEListBeenden()) {
                    ev.consume();
                }
                return;

            case COMMAND_GoogleAuthenticatorJ2MEListAbout:
                if(onGoogleAuthenticatorJ2MEListAbout()) {
                    ev.consume();
                }
                return;

            case COMMAND_NewAccountAbort:
                if(onNewAccountAbort()) {
                    ev.consume();
                }
                return;

        }
    }

    protected void exitForm(Form f) {
        if("AccountItemSelected".equals(f.getName())) {
            exitAccountItemSelected(f);
            return;
        }

        if("EmptyScreen".equals(f.getName())) {
            exitEmptyScreen(f);
            return;
        }

        if("NewAccount".equals(f.getName())) {
            exitNewAccount(f);
            return;
        }

        if("GoogleAuthenticatorJ2ME".equals(f.getName())) {
            exitGoogleAuthenticatorJ2ME(f);
            return;
        }

        if("About".equals(f.getName())) {
            exitAbout(f);
            return;
        }

        if("GoogleAuthenticatorJ2MEList".equals(f.getName())) {
            exitGoogleAuthenticatorJ2MEList(f);
            return;
        }

        if("EditAccount".equals(f.getName())) {
            exitEditAccount(f);
            return;
        }

        if("AccountItem".equals(f.getName())) {
            exitAccountItem(f);
            return;
        }

    }


    protected void exitAccountItemSelected(Form f) {
    }


    protected void exitEmptyScreen(Form f) {
    }


    protected void exitNewAccount(Form f) {
    }


    protected void exitGoogleAuthenticatorJ2ME(Form f) {
    }


    protected void exitAbout(Form f) {
    }


    protected void exitGoogleAuthenticatorJ2MEList(Form f) {
    }


    protected void exitEditAccount(Form f) {
    }


    protected void exitAccountItem(Form f) {
    }

    protected void beforeShow(Form f) {
        if("AccountItemSelected".equals(f.getName())) {
            beforeAccountItemSelected(f);
            return;
        }

        if("EmptyScreen".equals(f.getName())) {
            beforeEmptyScreen(f);
            return;
        }

        if("NewAccount".equals(f.getName())) {
            beforeNewAccount(f);
            return;
        }

        if("GoogleAuthenticatorJ2ME".equals(f.getName())) {
            beforeGoogleAuthenticatorJ2ME(f);
            return;
        }

        if("About".equals(f.getName())) {
            beforeAbout(f);
            return;
        }

        if("GoogleAuthenticatorJ2MEList".equals(f.getName())) {
            beforeGoogleAuthenticatorJ2MEList(f);
            return;
        }

        if("EditAccount".equals(f.getName())) {
            beforeEditAccount(f);
            return;
        }

        if("AccountItem".equals(f.getName())) {
            beforeAccountItem(f);
            return;
        }

    }


    protected void beforeAccountItemSelected(Form f) {
    }


    protected void beforeEmptyScreen(Form f) {
    }


    protected void beforeNewAccount(Form f) {
    }


    protected void beforeGoogleAuthenticatorJ2ME(Form f) {
    }


    protected void beforeAbout(Form f) {
    }


    protected void beforeGoogleAuthenticatorJ2MEList(Form f) {
    }


    protected void beforeEditAccount(Form f) {
    }


    protected void beforeAccountItem(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        if("AccountItemSelected".equals(c.getName())) {
            beforeContainerAccountItemSelected(c);
            return;
        }

        if("EmptyScreen".equals(c.getName())) {
            beforeContainerEmptyScreen(c);
            return;
        }

        if("NewAccount".equals(c.getName())) {
            beforeContainerNewAccount(c);
            return;
        }

        if("GoogleAuthenticatorJ2ME".equals(c.getName())) {
            beforeContainerGoogleAuthenticatorJ2ME(c);
            return;
        }

        if("About".equals(c.getName())) {
            beforeContainerAbout(c);
            return;
        }

        if("GoogleAuthenticatorJ2MEList".equals(c.getName())) {
            beforeContainerGoogleAuthenticatorJ2MEList(c);
            return;
        }

        if("EditAccount".equals(c.getName())) {
            beforeContainerEditAccount(c);
            return;
        }

        if("AccountItem".equals(c.getName())) {
            beforeContainerAccountItem(c);
            return;
        }

    }


    protected void beforeContainerAccountItemSelected(Container c) {
    }


    protected void beforeContainerEmptyScreen(Container c) {
    }


    protected void beforeContainerNewAccount(Container c) {
    }


    protected void beforeContainerGoogleAuthenticatorJ2ME(Container c) {
    }


    protected void beforeContainerAbout(Container c) {
    }


    protected void beforeContainerGoogleAuthenticatorJ2MEList(Container c) {
    }


    protected void beforeContainerEditAccount(Container c) {
    }


    protected void beforeContainerAccountItem(Container c) {
    }

    protected void postShow(Form f) {
        if("AccountItemSelected".equals(f.getName())) {
            postAccountItemSelected(f);
            return;
        }

        if("EmptyScreen".equals(f.getName())) {
            postEmptyScreen(f);
            return;
        }

        if("NewAccount".equals(f.getName())) {
            postNewAccount(f);
            return;
        }

        if("GoogleAuthenticatorJ2ME".equals(f.getName())) {
            postGoogleAuthenticatorJ2ME(f);
            return;
        }

        if("About".equals(f.getName())) {
            postAbout(f);
            return;
        }

        if("GoogleAuthenticatorJ2MEList".equals(f.getName())) {
            postGoogleAuthenticatorJ2MEList(f);
            return;
        }

        if("EditAccount".equals(f.getName())) {
            postEditAccount(f);
            return;
        }

        if("AccountItem".equals(f.getName())) {
            postAccountItem(f);
            return;
        }

    }


    protected void postAccountItemSelected(Form f) {
    }


    protected void postEmptyScreen(Form f) {
    }


    protected void postNewAccount(Form f) {
    }


    protected void postGoogleAuthenticatorJ2ME(Form f) {
    }


    protected void postAbout(Form f) {
    }


    protected void postGoogleAuthenticatorJ2MEList(Form f) {
    }


    protected void postEditAccount(Form f) {
    }


    protected void postAccountItem(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("AccountItemSelected".equals(c.getName())) {
            postContainerAccountItemSelected(c);
            return;
        }

        if("EmptyScreen".equals(c.getName())) {
            postContainerEmptyScreen(c);
            return;
        }

        if("NewAccount".equals(c.getName())) {
            postContainerNewAccount(c);
            return;
        }

        if("GoogleAuthenticatorJ2ME".equals(c.getName())) {
            postContainerGoogleAuthenticatorJ2ME(c);
            return;
        }

        if("About".equals(c.getName())) {
            postContainerAbout(c);
            return;
        }

        if("GoogleAuthenticatorJ2MEList".equals(c.getName())) {
            postContainerGoogleAuthenticatorJ2MEList(c);
            return;
        }

        if("EditAccount".equals(c.getName())) {
            postContainerEditAccount(c);
            return;
        }

        if("AccountItem".equals(c.getName())) {
            postContainerAccountItem(c);
            return;
        }

    }


    protected void postContainerAccountItemSelected(Container c) {
    }


    protected void postContainerEmptyScreen(Container c) {
    }


    protected void postContainerNewAccount(Container c) {
    }


    protected void postContainerGoogleAuthenticatorJ2ME(Container c) {
    }


    protected void postContainerAbout(Container c) {
    }


    protected void postContainerGoogleAuthenticatorJ2MEList(Container c) {
    }


    protected void postContainerEditAccount(Container c) {
    }


    protected void postContainerAccountItem(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("AccountItemSelected".equals(rootName)) {
            onCreateAccountItemSelected();
            return;
        }

        if("EmptyScreen".equals(rootName)) {
            onCreateEmptyScreen();
            return;
        }

        if("NewAccount".equals(rootName)) {
            onCreateNewAccount();
            return;
        }

        if("GoogleAuthenticatorJ2ME".equals(rootName)) {
            onCreateGoogleAuthenticatorJ2ME();
            return;
        }

        if("About".equals(rootName)) {
            onCreateAbout();
            return;
        }

        if("GoogleAuthenticatorJ2MEList".equals(rootName)) {
            onCreateGoogleAuthenticatorJ2MEList();
            return;
        }

        if("EditAccount".equals(rootName)) {
            onCreateEditAccount();
            return;
        }

        if("AccountItem".equals(rootName)) {
            onCreateAccountItem();
            return;
        }

    }


    protected void onCreateAccountItemSelected() {
    }


    protected void onCreateEmptyScreen() {
    }


    protected void onCreateNewAccount() {
    }


    protected void onCreateGoogleAuthenticatorJ2ME() {
    }


    protected void onCreateAbout() {
    }


    protected void onCreateGoogleAuthenticatorJ2MEList() {
    }


    protected void onCreateEditAccount() {
    }


    protected void onCreateAccountItem() {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("List".equals(listName)) {
            return initListModelList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        if(rootContainerName == null) return;
        if(rootContainerName.equals("AccountItemSelected")) {
            if("Key".equals(c.getName())) {
                onAccountItemSelected_KeyAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("EmptyScreen")) {
            if("Button".equals(c.getName())) {
                onEmptyScreen_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("NewAccount")) {
            if("TextFieldAccountName".equals(c.getName())) {
                onNewAccount_TextFieldAccountNameAction(c, event);
                return;
            }
            if("TextFieldKey".equals(c.getName())) {
                onNewAccount_TextFieldKeyAction(c, event);
                return;
            }
            if("ButtonCreateAccount".equals(c.getName())) {
                onNewAccount_ButtonCreateAccountAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onNewAccount_ButtonAction(c, event);
                return;
            }
            if("TextArea".equals(c.getName())) {
                onNewAccount_TextAreaAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("GoogleAuthenticatorJ2ME")) {
            if("Button3".equals(c.getName())) {
                onGoogleAuthenticatorJ2ME_Button3Action(c, event);
                return;
            }
            if("ButtonNewAccount".equals(c.getName())) {
                onGoogleAuthenticatorJ2ME_ButtonNewAccountAction(c, event);
                return;
            }
            if("ButtonExit".equals(c.getName())) {
                onGoogleAuthenticatorJ2ME_ButtonExitAction(c, event);
                return;
            }
            if("ButtonAbout".equals(c.getName())) {
                onGoogleAuthenticatorJ2ME_ButtonAboutAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("About")) {
            if("TextArea".equals(c.getName())) {
                onAbout_TextAreaAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onAbout_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("GoogleAuthenticatorJ2MEList")) {
            if("Key".equals(c.getName())) {
                onGoogleAuthenticatorJ2MEList_KeyAction(c, event);
                return;
            }
            if("List".equals(c.getName())) {
                onGoogleAuthenticatorJ2MEList_ListAction(c, event);
                return;
            }
            if("ButtonNewAccount".equals(c.getName())) {
                onGoogleAuthenticatorJ2MEList_ButtonNewAccountAction(c, event);
                return;
            }
            if("ButtonAbout".equals(c.getName())) {
                onGoogleAuthenticatorJ2MEList_ButtonAboutAction(c, event);
                return;
            }
            if("ButtonExit".equals(c.getName())) {
                onGoogleAuthenticatorJ2MEList_ButtonExitAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("EditAccount")) {
            if("TextFieldAccountName".equals(c.getName())) {
                onEditAccount_TextFieldAccountNameAction(c, event);
                return;
            }
            if("TextFieldKey".equals(c.getName())) {
                onEditAccount_TextFieldKeyAction(c, event);
                return;
            }
            if("TextArea".equals(c.getName())) {
                onEditAccount_TextAreaAction(c, event);
                return;
            }
            if("ButtonDeleteAccount".equals(c.getName())) {
                onEditAccount_ButtonDeleteAccountAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("AccountItem")) {
            if("Key".equals(c.getName())) {
                onAccountItem_KeyAction(c, event);
                return;
            }
        }
    }

      protected void onAccountItemSelected_KeyAction(Component c, ActionEvent event) {
      }

      protected void onEmptyScreen_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewAccount_TextFieldAccountNameAction(Component c, ActionEvent event) {
      }

      protected void onNewAccount_TextFieldKeyAction(Component c, ActionEvent event) {
      }

      protected void onNewAccount_ButtonCreateAccountAction(Component c, ActionEvent event) {
      }

      protected void onNewAccount_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onNewAccount_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2ME_Button3Action(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2ME_ButtonNewAccountAction(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2ME_ButtonExitAction(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2ME_ButtonAboutAction(Component c, ActionEvent event) {
      }

      protected void onAbout_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onAbout_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2MEList_KeyAction(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2MEList_ListAction(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2MEList_ButtonNewAccountAction(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2MEList_ButtonAboutAction(Component c, ActionEvent event) {
      }

      protected void onGoogleAuthenticatorJ2MEList_ButtonExitAction(Component c, ActionEvent event) {
      }

      protected void onEditAccount_TextFieldAccountNameAction(Component c, ActionEvent event) {
      }

      protected void onEditAccount_TextFieldKeyAction(Component c, ActionEvent event) {
      }

      protected void onEditAccount_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onEditAccount_ButtonDeleteAccountAction(Component c, ActionEvent event) {
      }

      protected void onAccountItem_KeyAction(Component c, ActionEvent event) {
      }

}
