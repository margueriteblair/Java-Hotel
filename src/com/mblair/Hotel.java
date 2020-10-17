package com.mblair;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

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


}
