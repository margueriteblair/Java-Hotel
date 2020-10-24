package com.mblair;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Hotel javaHotel = new Hotel("Java Hotel",
                new StandardRoom(1000, 101, "single", 1, 1, 1),
                new StandardRoom(2000, 404, "single", 4 , 1, 2),
                new StandardRoom(1500, 302, "single", 3, 1, 1),
                new SuiteRoom(10000, 707, "suite", 7, 2, 3),
                new SuiteRoom(15000, 810, "suite", 8, 3, 3)
                );
        //create command line interface code to go below
        //that way, when we run the main program, just like with the mortgage
        //calculator, we're taken through the steps of the program
        cliLogic(javaHotel);
    }

    public static void cliLogic(Hotel hotel) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome valued hotel guest!\nWould you like to check in or check out?");
            System.out.println("Please type 'in' for checking in, 'out' for leaving. 'Exit' to leave application.");
            String token = scanner.next();
            if (token.trim().equals("in")) {
                System.out.println("Please select one of the available rooms from below:");

                for (var room: hotel.availableSuites) {
                    System.out.println("Room " + room.getRoomNum() + " - $" + room.getAveragePrice() + " - " + room.getRoomType() + "     ");
                }
                for (var room: hotel.availableStandards) {
                    System.out.println("Room " + room.getRoomNum() + " - $" + room.getAveragePrice() + " - " + room.getRoomType() + "     ");
                }

//                for (var room : hotel.allRooms.entrySet()) {
//                    System.out.print("Room " + room.getKey() + " - $" + room.getValue().getAveragePrice() + " - " + room.getValue().getRoomType() + "      ");
//                }
                System.out.println();

                //we need logic to ensure that the room they put in for actually exists
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
                    //could also use client.getName() and such and such methods
                    //add a back to main menu type of thing here?
                    Thread thread = new Thread();
                    //the following code pauses it for a bit before circling back into the code
                    try {
                        thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        scanner.nextLine();
                    }
                } else if (!hotel.allRooms.containsKey(selectedRoom)) {
                    System.out.println("Error in trying to book your room, please try again.");
                }
                //put this shit above in a while loop^^^

            } else if (token.trim().toLowerCase().equals("out")) {
                //checking out logic
                System.out.println("Please select which of the following rooms you're checking out of:");
                for (var room : hotel.reservedStandards) {
                    System.out.println(room.getRoomNum());
                }
                for (var room: hotel.reservedSuites) {
                    System.out.println(room.getRoomNum());
                }
                int selectedRoom = scanner.nextInt();
                //add logic to ensure type of room is in there
                System.out.println("Great! For confirmation, please type your full name as you used it to book the room: ");
                scanner.nextLine();
                String checkoutClient = scanner.nextLine();
                hotel.checkoutRoom(hotel.allRooms.get(selectedRoom));
                System.out.println("Type the remaining balance to pay and check out.");
                int balance = scanner.nextInt();
                System.out.println("Thank you, " + checkoutClient + "! We'll see you next time.");
                Thread thread = new Thread();
                //the following code pauses it for a bit before circling back into the code main menu
                try {
                    thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    scanner.nextLine();
                }

            } else if (token.trim().toLowerCase().equals("exit")) {
                return;
            } else {
                System.out.println("Please input a valid option.");
            }

        }
//note to self, maybe a hashmap with a unique key and value for each room to make it easier//for guests
// somewhere have to place a break or return statement to have the while loop end

    }
}
