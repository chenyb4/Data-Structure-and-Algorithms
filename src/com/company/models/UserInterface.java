package com.company.models;

import com.company.UserInterfaceHandler;

import java.util.*;

public class UserInterface {

    private UserInterfaceHandler handler;

    public UserInterfaceHandler getHandler() {
        return handler;
    }

    //Constructor
    public UserInterface(UserInterfaceHandler handler) {
        this.handler = handler;
    }

    /**
     * This is where the user select one of the menu items and does some operation with it
     */

    public void startUserInterface () {
        menuItems();
        String userInput = readString();
        do {
            switch (userInput) {
                case "1" -> handler.getPackageStatus();
                case "2" -> handler.findTopTen();
                case "3" -> {}
                case "4" -> {}
                case "5" -> {}
                case "?" -> menuItems();
                case "0" -> System.out.println("Goodbye");
                default -> System.err.println("Invalid input");
            }
            userInput = readString();
        } while (!userInput.equals("0"));
    }

    //All the menu items will be displayed here
    public static void menuItems () {
        System.out.println("Please choose one of the following items: \n" +
                "1) to find a package by package id. \n" +
                "2) to find the top 10 recipients in a period. \n" +
                "3) to find the best route for teh driver to a given address. \n" +
                "4) to calculate how many drivers needed per day\n" +
                "5) \n" +
                "?) This menu \n" +
                "0) Exit \n");
    }

    //Read user input as a string
    public static String readString () {
        return new Scanner(System.in).nextLine();
    }
}
