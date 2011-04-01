/*
 * Feel free to update this class
 */

package userclasses;

import Storage.AppSettingsManager;
import TokenGenerator.ITokenGen;
import TokenGenerator.TokenGen;
import com.sun.lwuit.Display;
import java.math.BigInteger;
import javax.microedition.midlet.*;

/**
 * @author Your Name Here
 */
public class MainMIDlet extends MIDlet implements Runnable {
    public void startApp() {
        Display.init(this);
        Display.getInstance().callSerially(this);

    }

    public void run() {
        StateMachine gui = new StateMachine("/LWUIT.res");
        gui.initAccountManager(new AppSettingsManager());
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
