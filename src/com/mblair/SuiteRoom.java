package com.mblair;

public class SuiteRoom extends StandardRoom {
    //note to self: originally had SuiteRoom just extend room
    //ended up switching it to extend StandardRoom because StandardRoom constructor already has reds & rooms built in
    private boolean needsRestock;
    private boolean kitchenette;

    //you don't need to redeclare stuff that has been inherited

    public SuiteRoom(int averagePrice, int roomNum, String roomType, int roomFloor, int beds, int rooms) {
        //constructor baby!
        super(averagePrice, roomNum, roomType, roomFloor, beds, rooms);
        this.kitchenette = kitchenette; //kitchenette returns a boolean anyways
        //room type will always be 'suite'
    }

    //second SuiteRoom() constructor to demonstrate constructor overloading
    //this one is more of a default
    public SuiteRoom(int averagePrice, int roomNum, int roomFloor) {
        super(averagePrice, roomNum, "suite", roomFloor, 2, 2);
        this.kitchenette = true;

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
