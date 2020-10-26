package com.mblair;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String hotelName;

    public Map<Integer,Room> allRooms = new HashMap<>();
    public List<StandardRoom> availableStandards = new ArrayList<>();
    public List<StandardRoom> reservedStandards = new ArrayList<>();
    public List<SuiteRoom> availableSuites = new ArrayList<>();
    public List<SuiteRoom> reservedSuites = new ArrayList<>();
    public List<Client> clients = new ArrayList<>();

    //Hotel constructor

    public Hotel(String hotelName, Room... rooms) {
        this.hotelName = hotelName;
        for (var room: rooms) {
            addRoom(room);
        }
    }

    public void addRoom(Room room) {
        //add room to either suite room
        //or add room to standard room list
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
            room.reserve(client); //this should work, me thinks
            clients.add(client);
        } else if (room.getRoomType().equals("suite")) {
            reservedSuites.add((SuiteRoom) room);
            availableSuites.remove((SuiteRoom) room); //casting
            room.reserve(client);
            clients.add(client);
        }
    }

    public void checkoutRoom(Room room) {
        //run the checkout process for a room and move the room
        //from reserved to available
        if (room.getRoomType().equals("single")) {
            reservedStandards.remove((StandardRoom) room);
            availableStandards.add((StandardRoom) room);
            room.checkout();
        } else if (room.getRoomType().equals("suite")) {
            reservedSuites.remove((SuiteRoom) room);
            availableSuites.add((SuiteRoom) room);
            room.checkout();
        }
    }

    public void getClientBalance(Client client) {
        String name = client.getName();
        client.getOutstanding();
        //check tictactoe logic for repeating cycle
    }


}
