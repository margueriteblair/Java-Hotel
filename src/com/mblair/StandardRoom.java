package com.mblair;

public class StandardRoom extends Room {
    private int rooms = 1;
    private int beds = 1;

    @Override
    public boolean reserve(Client client) {
        if (client.getPartySize() > 2 * beds) {
            System.out.println("Room at capacity, not available.");
            return false;
        }
        return super.reserve(client);
    }

    public StandardRoom(int averagePrice, int roomNum, String roomType, int roomFloor) {
        super(averagePrice, roomNum, "single", roomFloor);
        this.rooms = rooms;
        this.beds = beds;
    }

}
