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

import javax.microedition.rms.RecordStore;

/**
 *
 * @author redrocketracoon@googlemail.com
 * based on http://www.java2s.com/Tutorial/Java/0430__J2ME/FilterFields.htm
 */
public class StorageManager {

    /**
     *
     */
    protected int recordNumber = 1;
    /**
     * sets name of record store
     */
    protected String recordStoreName = "standard";

    /**
     * saves data to the recordstore
     * @param data
     */
    protected void saveData(byte[] data) throws Exception {
        RecordStore rs = RecordStore.openRecordStore(recordStoreName, true);
        if (rs.getNumRecords() > 0) {
            rs.setRecord(recordNumber, data, 0, data.length);
        } else {
            int numrec = rs.addRecord(data, 0, data.length);
        }

        rs.closeRecordStore();
    }

    /**
     * retrieves data from the recordstore
     * @return
     */
    protected byte[] getData() throws Exception {
        byte[] data = null;
        RecordStore rs = RecordStore.openRecordStore(recordStoreName, false);
        if (rs.getNumRecords() > 0) {
            if (rs.getRecord(recordNumber) != null) {
                data = rs.getRecord(recordNumber);
            }
        }

        rs.closeRecordStore();
        return data;
    }
}
