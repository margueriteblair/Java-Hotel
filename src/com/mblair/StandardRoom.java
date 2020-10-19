package com.mblair;

public class StandardRoom extends Room {
    private int rooms;
    private int beds;
    private final int ROOM_LIMIT = 2; //final int so that we don't have to hardcode it

    @Override
    public boolean reserve(Client client) {
        if (client.getPartySize() > ROOM_LIMIT * beds) {
            System.out.println("Room at capacity, not available for that party size.");
            return false;
        }
        return super.reserve(client);
    }


    public StandardRoom(int averagePrice, int roomNum, String roomType, int roomFloor, int rooms, int beds) {
        super(averagePrice, roomNum, roomType, roomFloor);
        this.rooms = rooms;
        this.beds = beds;
    }

    public StandardRoom(int averagePrice, int roomNum) {
        this(averagePrice, roomNum, "single", roomNum / 100, 1, 1);

    }
    //roomNum / 100 for roomFloor!! Margie plz read this later
    //should i overload the standard room constructor with a specific instance
    //where rooms and beds = 1 each

}
