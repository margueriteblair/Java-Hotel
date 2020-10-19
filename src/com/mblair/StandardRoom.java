package com.mblair;

public class StandardRoom extends Room {
    private int rooms;
    private int beds;

    @Override
    public boolean reserve(Client client) {
        return super.reserve(client);
    }

    public StandardRoom(int averagePrice, int roomNum, String roomType, int roomFloor) {
        super(averagePrice, roomNum, "single", roomFloor);
        this.rooms = rooms;
        this.beds = beds;
    }

}
