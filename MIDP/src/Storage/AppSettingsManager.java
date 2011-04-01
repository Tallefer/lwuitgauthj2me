/*
 *
 *
Copyright 2011 redrocketracoon@googlemail.com
This file is part of WebSMSsend.

WebSMSsend is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

WebSMSsend is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with WebSMSsend.  If not, see <http://www.gnu.org/licenses/>.

 *
 *
 */
package Storage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import userclasses.Account;
import userclasses.IAccountStorage;

/**
 *
 * @author redrocketracoon@googlemail.com
 */
public class AppSettingsManager extends StorageManager implements IAccountStorage {

    public AppSettingsManager() {
        this.recordStoreName = "GoogleAuthenticatorSettings";
    }

    public void saveAccounts(Account[] accountArray) {
        try {
            byte[] data = changeAppSettingsToByteArray(accountArray);
            this.saveData(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Account[] retrieveAccounts() {
        try {
            byte[] data = this.getData();
            return changeAppSettingsFromByteArray(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new Account[0];
    }

    private byte[] changeAppSettingsToByteArray(Account[] accountArray) {
        byte[] data = null;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);

            dos.writeInt(accountArray.length);

            for (int i = 0; i < accountArray.length; i++) {
                dos.writeUTF(accountArray[i].getAccountName());
                dos.writeUTF(accountArray[i].getSecretKey());
            }

            baos.close();
            dos.close();
            data = baos.toByteArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    private Account[] changeAppSettingsFromByteArray(byte[] data) {
        Account[] accountArray = new Account[0];
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            DataInputStream dis = new DataInputStream(bais);

            int accountNumber = dis.readInt();
            accountArray = new Account[accountNumber];


            for (int i = 0; i < accountNumber; i++) {
                accountArray[i] = new Account(dis.readUTF(), dis.readUTF());
            }

            bais.close();
            dis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return accountArray;
    }
}
