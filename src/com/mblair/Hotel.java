package com.mblair;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String hotelName;
    private int numOfRooms;

    //arraylists of each available and reserved standard rooms

    Map<Integer,Room> allRooms = new HashMap<>();
    List<StandardRoom> availableStandards = new ArrayList<>();
    List<StandardRoom> reservedStandards = new ArrayList<>();
    List<SuiteRoom> availableSuites = new ArrayList<>();
    List<SuiteRoom> reservedSuites = new ArrayList<>();
    List<Client> clients = new ArrayList<>();

    //Hotel constructor

    public Hotel(String hotelName, Room... rooms) {
        this.hotelName = hotelName;
        for (var room: rooms) {
            addRoom(room);
        }
    }

    public void addRoom(Room room) {
        //add room to either suite room
        //or add room to standard room list hehe
        if (room.getRoomType().equals("suite")) {
            availableSuites.add((SuiteRoom) room);
        } else {
            availableStandards.add((StandardRoom) room);
        }
        allRooms.put(room.getRoomNum(), room);
    }

    public void reserveRoom(Room room, Client client) {
        //pull a room from the correct list
        //if empty, print "unavailable"
        //otherwise, run the checkout for the room and move the room from
        //available to reserved
        //add client to clients list
        if (room.getRoomType().equals("single")) {
            reservedStandards.add((StandardRoom) room);
            availableStandards.remove((StandardRoom) room);
            room.setIsOccupied(room.isOccupied()); //this should work, me thinks
        } else if (room.getRoomType().equals("suite")) {
            reservedSuites.add((SuiteRoom) room);
            availableSuites.remove((SuiteRoom) room); //casting
            room.setIsOccupied(room.isOccupied());
        }
    }

    public void checkoutRoom(Room room) {
        //run the checkout process for a room and move the room
        //from reserved to available
    }

    public void getClientBalance() {
        //get the balance of a client either by their room number
        //or by their name
    }


}
