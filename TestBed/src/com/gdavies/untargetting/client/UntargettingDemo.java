package com.gdavies.untargetting.client;

import com.gdavies.untargetting.server.PixelFireManager;

import java.util.ArrayList;

/**
 * Created by geoff on 7/30/14.
 */
public class UntargettingDemo {

    static PixelFireManager pfm = new PixelFireManager();

    public static void main(String[] args) {

        String ip;


        ip = "192.168.1.1";
        System.out.println("Testing using ip " + ip);
        getForThisIp(ip);

        ip = "192.168.1.2";
        System.out.println("Testing using ip " + ip);
        getForThisIp(ip);


    }

    private static void getForThisIp(String ip) {

        ArrayList<String> clientTosSendTo;

        System.out.println("Test for Delay with a second - third set should be empty");
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);

        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);

        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);

        System.out.println("Now Testing for max per hour - final set should be empty");
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);

        System.out.println("Now a final test to make sure it wasn't a fluke - set should be empty");
        try {
            System.out.println("Waiting 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clientTosSendTo = pfm.getNextClients(ip);
        System.out.println(clientTosSendTo);
    }
}
