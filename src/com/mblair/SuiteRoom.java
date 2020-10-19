package com.mblair;

public class SuiteRoom extends Room {
    private String roomType;
    private boolean needsRestock;
    private boolean kitchenette;
    private int rooms;
    private int beds;

    public SuiteRoom(int averagePrice, int roomNum, String roomType, int roomFloor) {
        //constructor baby!
        super(averagePrice, roomNum, roomType, roomFloor); //the defaults
        //room type will always be 'single'
    }

    @Override
    public boolean reserve(Client client) {
        if (needsRestock) {
            System.out.println("Room not currently available, needs to be restocked.");
            return false;
        }
        return super.reserve(client);
    }

    @Override
    public void checkout() {
        needsRestock = true;
        super.checkout();
    }

    public void restock() {
        needsRestock = false;
    }

}
