package com.mblair;

public class StandardRoom extends Room {

    private int rooms; //number of rooms
    private int beds; //number of beds, distinguishes from a suite!

    @Override
    public boolean reserve(Client client) {
        return super.reserve(client);
    }

    public StandardRoom(int averagePrice, int roomNum, String roomType, int roomFloor) {
        super(averagePrice, roomNum, roomType, roomFloor); //use getters to get these bad mamma jammas
        rooms = 1;
        beds = 1;
    }


//    public StandardRoom() {
//        super(averagePrice, roomNum, "single", roomFloor);
//        rooms = 1;
//        beds = 1;
//        //constructor baby!
//    }
}
