package com.mblair;

import java.util.Scanner;

public class CheckingInCli {
    public static void checkin(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select one of the available rooms from below:");
        for (var room : hotel.availableSuites) {
            System.out.println("Room " + room.getRoomNum() + " - $" + room.getAveragePrice() + " - " + room.getRoomType() + "     ");
        }
        for (var room : hotel.availableStandards) {
            System.out.println("Room " + room.getRoomNum() + " - $" + room.getAveragePrice() + " - " + room.getRoomType() + "     ");
        }
        System.out.println();
        int selectedRoom = scanner.nextInt();
        scanner.nextLine();
        if (hotel.allRooms.containsKey(selectedRoom)) {
            System.out.println("Type your full name to book the room:");
            String resName = scanner.nextLine();
            System.out.println("Please enter an amount to pay now for the room. Doesn't have to be total, but must be an integer. Total cost for the room is " + hotel.allRooms.get(selectedRoom).getAveragePrice());
            int prepaidAmt = scanner.nextInt();
            System.out.println("Please input your phone number: ");
            scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            System.out.println("Lastly, how many guests are in your booking party?");
            int partySize = scanner.nextInt();

            Client client = new Client(resName, phoneNumber, partySize);
            client.setPrepaidAmt(prepaidAmt);
            client.setCurrentBill(hotel.allRooms.get(selectedRoom).getAveragePrice());
            hotel.reserveRoom(hotel.allRooms.get(selectedRoom), client);
            System.out.println("Reservation in room " + selectedRoom + " booked, " + resName + ", enjoy your stay!");

        } else if (!hotel.allRooms.containsKey(selectedRoom)) {
        System.out.println("Error in trying to book your room, please try again.");
    }
    }
}
