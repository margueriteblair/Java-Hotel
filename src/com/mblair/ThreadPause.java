package com.mblair;

import java.util.Scanner;

public class ThreadPause {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Thread thread = new Thread();
        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            scanner.nextLine();
        }
    }
}
