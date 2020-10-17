package com.mblair;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hotel javaHotel = new Hotel("Java Hotel",
                new StandardRoom(),
                new StandardRoom(),
                new StandardRoom(),
                new SuiteRoom(),
                new SuiteRoom()
                );
        //create command line interface code to go below
        //that way, when we run the main program, just like with the mortgage
        //calculator, we're taken through the steps of the program
    }
}
