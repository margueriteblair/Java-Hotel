package com.mblair;

public class SuiteRoom extends Room {
    private String roomType;
    private boolean needsRestock;
    //

    public SuiteRoom(int averagePrice, int roomNum, String roomType, int roomFloor) {
        //constructor baby!
        super(averagePrice, roomNum, roomType, roomFloor); //the defaults
        //room type will always be 'single'
    }

    public void overrideReserve() {
        //include a check on needsRestock then run standard reserve
    }

    public void overrideCheckout() {
        //set needsRestock to true run standard checkout
        needsRestock = true;
        checkout();
    }

    public void restock() {
        needsRestock = false;
    }

}
