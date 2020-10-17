package com.mblair;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hotel javaHotel = new Hotel("Java Hotel",
                new StandardRoom(1000, 101, "single", 1),
                new StandardRoom(2000, 404, "single", 4),
                new StandardRoom(1500, 302, "single", 3)
//                new SuiteRoom(),
//                new SuiteRoom()
                );
        //create command line interface code to go below
        //that way, when we run the main program, just like with the mortgage
        //calculator, we're taken through the steps of the program
        cliLogic(javaHotel);
    }

    public static void cliLogic(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome valued hotel guest!\nWould you like to check in or check out?");
        System.out.println("Please type 'in' for checking in, 'out' for leaving.");
        String token = scanner.next();
        if (token.trim().equals("in")) {
            //checking in logic
            System.out.println("Please select one of the available rooms from below:");
            System.out.println(hotel.allRooms);
        } else if (token.trim().equals("out")) {
            //checking out logic
            System.out.println("You're checking out.");
        } else {
            System.out.println("Please input a valid option.");
        }
//note to self, maybe a hashmap with a unique key and value for each room to make it easier//for guests

        scanner.close();
    }
}
