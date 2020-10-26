package com.mblair;

import java.util.Scanner;

public class CheckingOutCli {

    public static void checkout(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select which of the following rooms you're checking out of:");
        for (var room : hotel.reservedStandards) {
            System.out.println(room.getRoomNum());
        }
        for (var room: hotel.reservedSuites) {
            System.out.println(room.getRoomNum());
        }
        int selectedRoom = scanner.nextInt();
        System.out.println("Great! For confirmation, please type your full name as you used it to book the room: ");
        scanner.nextLine();
        String checkoutClient = scanner.nextLine();
        hotel.checkoutRoom(hotel.allRooms.get(selectedRoom));
        System.out.println("Type the remaining balance to pay and check out.");
        int balance = scanner.nextInt();
        System.out.println("Thank you, " + checkoutClient + "! We'll see you next time.");

    }
}
