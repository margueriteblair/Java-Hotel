package com.mblair;

public abstract class Room {
    private int roomNum;
    private String roomType;
    private int roomFloor;
    private boolean isOccupied;
    private boolean needsCleaning;
    private Client occupant;
    private int averagePrice;

    public Room(int averagePrice, int roomNum, String roomType, int roomFloor) {
        //this will be the constructor function for the class
        //when we instantiate this in other classes, we'll have to pass in the
        //constructor's parameters
        this.averagePrice = averagePrice;
        this.roomNum = roomNum;
        this.roomFloor = roomFloor;
        this.roomType = roomType;
    }

    public boolean reserve(Client client) {
        if (isOccupied == true || needsCleaning == true) {
            System.out.println("This room is not available!");
            return false;
        }
        isOccupied = true;
        occupant = client;
//        client.roomNum = this; //we're setting it equal to this instantiation

        return true;
    }

    public void clean() {
        needsCleaning = false;
    }

    public void checkout() {
        isOccupied = false;
        needsCleaning = true;
        System.out.println("Outstanding price: $" );//occupant.getBalance());
    //note to self, margie, create get outstandingbalance() method for the client

    }

    //create our getters and setters below:
    public int getRoomNum() {
        return roomNum;
    }

    public int getAveragePrice() {
        return averagePrice;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isNeedsCleaning() {
        return needsCleaning;
    }

    public Client getOccupant() {
        return occupant;
    }
}
