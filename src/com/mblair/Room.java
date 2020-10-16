package com.mblair;

public class Room {
    private int roomNum;
    private String roomType;
    private int roomFloor;
    private boolean isOccupied;
    private boolean needsCleaning;
    private Client occupant;
    private int averagePrice;

    public Room() {
        //this will be the constructor function for the class
        //when we instantiate this in other classes, we'll have to pass in the
        //constructor's parameters
    }

    public boolean reserve() {
        isOccupied = true;
        return true;
    }

    public void clean() {
        needsCleaning = false;
    }
}
