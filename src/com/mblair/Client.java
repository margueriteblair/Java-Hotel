package com.mblair;

public class Client {
    private String name;
    private int partySize;
    private int currentBill;
    private int prepaidAmt;
    private String phoneNumber; //nb: we have to put in the phone numbers as a string
    private int roomNumber;
    private String roomType;
    Room room;

    public Client(String name, String phoneNumber, int partySize) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.partySize = partySize;
    }

    public void makePayment(int newAmount) {
        //increase the prepaid amount
        prepaidAmt += newAmount;
    }

    public void chargeRoom(int newAmount) {
        //this method increases the current bill
        currentBill += newAmount;
    }

    public int getOutstanding() {
        //returns the outstanding balance
        return currentBill - prepaidAmt;

    }



    //setter and getter functions
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
