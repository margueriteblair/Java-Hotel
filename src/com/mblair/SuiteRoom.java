package com.mblair;

public class SuiteRoom extends Room {
    private boolean needsRestock;
    private boolean kitchenette;
    private int beds;
    private int rooms;
    //you don't need to redeclare stuff that has been inherited

    public SuiteRoom(int averagePrice, int roomNum, String roomType, int roomFloor) {
        //constructor baby!
        super(averagePrice, roomNum, roomType, roomFloor);
        this.kitchenette = kitchenette; //kitchenette returns a boolean anyways
        //room type will always be 'suite'
    }

    //second SuiteRoom() constructor to demonstrate constructor overloading
    //this one is more of a default
    public SuiteRoom(int averagePrice, int roomNum, int roomFloor) {
        super(averagePrice, roomNum, "suite", roomFloor);
        this.kitchenette = true;
        this.beds = 1;
        this.rooms = 1;
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

    public boolean hasKitchenette() {
        return kitchenette;
    }

    public boolean getNeedsRestock() {
        return needsRestock;
    }

}
