package com.mblair;

public class SuiteRoom extends Room {
    private String roomType;
    private boolean needsRestock;
    //

    public SuiteRoom() {
        //constructor baby!
        super();
    }

    public void overrideReserve() {
        //include a check on needsRestock then run standard reserve
    }

    public void overrideCheckout() {
        //set needsRestock to true run standard checkout
    }

    public void restock() {
        needsRestock = false;
    }

}
