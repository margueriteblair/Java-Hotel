package com.mblair;

public class Client {
    private String name;
    private int partySize;
    private int currentBill;
    private double prepaidAmt;
    private String phoneNumber; //nb: we have to put in the phone numbers as a string
    private int roomNumber;
    private String roomType;
    Room room;

    public Client(String name, String phoneNumber, int partySize) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.partySize = partySize;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPartySize() {
        return partySize;
    }

    public Room getRoom() {
        return room;
    }


}
