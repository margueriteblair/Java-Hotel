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

        cliLogic(javaHotel);
    }

    public static void cliLogic(Hotel hotel) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome valued hotel guest!\nWould you like to check in or check out?");
            System.out.println("Please type 'in' for checking in, 'out' for leaving. 'Exit' to leave application.");
            String token = scanner.next();
            if (token.trim().equals("in")) {
                    CheckingInCli.checkin(hotel);
                    Thread thread = new Thread();
                    try {
                        thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        scanner.nextLine();
                    }
//                } else if (!hotel.allRooms.containsKey(selectedRoom)) {
//                    System.out.println("Error in trying to book your room, please try again.");
//                }
            } else if (token.trim().toLowerCase().equals("out")) {
                CheckingOutCli.checkout(hotel);
                Thread thread = new Thread();
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

    }
}
