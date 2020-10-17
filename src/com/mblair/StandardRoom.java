package com.mblair;

public class StandardRoom extends Room {
    @Override
    public boolean reserve(Client client) {
        return super.reserve(client);
    }

    public StandardRoom() {
        //constructor baby!
    }
}
