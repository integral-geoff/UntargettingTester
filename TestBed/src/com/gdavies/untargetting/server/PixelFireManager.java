package com.gdavies.untargetting.server;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by geoff on 7/30/14.
 */
public class PixelFireManager {

    private static final String[] clients = {"A","B","C","D","E","F","G","H"};
    private HashMap<String,ClientsTracker> allClients = new HashMap<String, ClientsTracker>();

    public ArrayList<String> getNextClients(String ip) {

        // is ip in table, if not create dummy entries
        ClientsTracker pfg = getPixelFireGroup(ip);
        return pfg.getRecs(5);
    }

    private ClientsTracker getPixelFireGroup(String ip) {

        ClientsTracker pfg = allClients.get(ip);
        if (pfg == null) {
            pfg = createInitialPixelFireGroup();
            allClients.put(ip,pfg);
        }
        return pfg;
    }

    private ClientsTracker createInitialPixelFireGroup() {

        return new ClientsTracker(clients);

    }

}
