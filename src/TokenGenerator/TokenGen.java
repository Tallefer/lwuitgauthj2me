/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TokenGenerator;

import java.util.Date;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

//
/**
 *
 * @author Rafael Beck (rafael.beck.med@gmail.com) and Thomas Luﬂnig
 */
public class TokenGen implements ITokenGen {

    private String key = null;
    private byte[] decodedKey = null; //Base32.decode(key);
    private int digits = 6;
    private long period = 30000;

    public TokenGen() {
        setKey("None");
    }

    public TokenGen(String newKey) {
        setKey(newKey);
    }

    public String GenToken() {
        final byte msg[] = new byte[8];
        final long T = (new Date()).getTime() / period;
        for (int i = 0; i < 8; i++) {
            msg[7 - i] = (byte) (T >>> (i * 8));
        }

        final HMac hmac = new HMac(new SHA1Digest());
        final byte[] hash = new byte[hmac.getMacSize()];
        hmac.init(new KeyParameter(this.decodedKey));
        hmac.update(msg, 0, msg.length);
        hmac.doFinal(hash, 0);

        final int off = hash[hash.length - 1] & 0xF;
        int binary =
                ((hash[off] & 0x7f) << 24)
                | ((hash[off + 1] & 0xff) << 16)
                | ((hash[off + 2] & 0xff) << 8)
                | ((hash[off + 3] & 0xff));

        for (int i = 0; i < digits; i++) {
            msg[digits - 1 - i] = (byte) ('0' + (char) (binary % 10));
            binary /= 10;
        }
        return new String(msg, 0, digits);
    }

    public void setKey(String newKey) {
        if (newKey == null) {
            newKey = "None";
        } else if (newKey.length() <= 0) {
            newKey = "None";
        }
        key = newKey;
        decodedKey = Base32.decode(key);
    }
}
