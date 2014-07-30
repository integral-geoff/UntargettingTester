package com.gdavies.untargetting.server;

/**
 * Created by geoff on 7/30/14.
 */
public class PixelFire {

    private String clientId;
    private long timestamp = 0;
    private int numberOfTimesUsed = 0;

    public PixelFire(String clientId) {
        this.clientId = clientId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void markUsed(long timestamp) {
        this.timestamp = timestamp;
        incrementUsedCounter();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    private void incrementUsedCounter() {
        numberOfTimesUsed++;
    }

    public int getNumberOfTimesUsed() {
        return numberOfTimesUsed;
    }
}
