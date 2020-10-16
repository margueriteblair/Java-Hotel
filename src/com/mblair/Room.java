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

}
