package com.mblair;

public class StandardRoom extends Room {
    private int rooms = 1;
    private int beds = 1;
    private final int ROOM_LIMIT = 2; //final int so that we don't have to hardcode it

    @Override
    public boolean reserve(Client client) {
        if (client.getPartySize() > ROOM_LIMIT * beds) {
            System.out.println("Room at capacity, not available for that party size.");
            return false;
        }
        return super.reserve(client);
    }

    public StandardRoom(int averagePrice, int roomNum, String roomType, int roomFloor) {
        super(averagePrice, roomNum, "single", roomFloor);
        this.rooms = rooms;
        this.beds = beds;
    }
    //should i overload the standard room constructor with a specific instance
    //where rooms and beds = 1 each

}
