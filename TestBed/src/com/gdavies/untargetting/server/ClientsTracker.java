package com.gdavies.untargetting.server;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by geoff on 7/30/14.
 */
public class ClientsTracker {

    /*
    Hold a client list for an ip
     */

    private static final long DELAY = 1000;
    private static final int MAX_PER_HOUR = 5;

    ArrayList<PixelFire> pixelFires = new ArrayList<PixelFire>();
    int nextRec = 0;


    public ClientsTracker(String[] clients) {

        for(int loop=0;loop<clients.length;loop++) {
            pixelFires.add(new PixelFire(clients[loop]));
        }
    }

    public ArrayList<String> getRecs(int count) {

        ArrayList<String> result = new ArrayList<String>();
        long now = new Date().getTime();  // seconds
        for (int loop = 0 ; loop < count ; loop++) {
            PixelFire pf = pixelFires.get(nextRec);
            if ((pf.getNumberOfTimesUsed() >=MAX_PER_HOUR) || (now - pf.getTimestamp() < DELAY)) {
                break;
            }
            result.add(pf.getClientId());
            pf.markUsed(now);
            nextRec++;
            if (nextRec == pixelFires.size()) {
                nextRec = 0;
            }
        }
        return result;
    }
}
