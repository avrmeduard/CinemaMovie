package com.company;

import java.util.Scanner;


public class Menu {

    Scanner sc = new Scanner(System.in);

    public void welcomeText() {
        System.out.println("\nWelcome to cineMAX\n");
    }


    public void helpText() {
        System.out.println("\nInsert a number to choose an option for the menu : ");
    }

    public void printMenu() {
        System.out.println("\n1. Show tonight movies.\n" +
                "2. Show 2D movies.\n" +
                "3. Show 3D movies.\n" +
                "4. Show movie by genre.\n" +
                "5. Buy a ticket.\n" +
                "6. Exit\n"
        );
    }

    public void buyTicket() {

    }

    public void ticketMenu() {

        System.out.println("\n1. Buy an adult ticket\n" +
                "2. Buy a child ticket \n" +
                "3. Buy a family ticket (2 adults + 1 child ticket)\n" +
                "4. Buy a lovers ticket (2 adults ticket)\n" +
                "5. Buy a student ticket for a half price\n" +
                "6. Add popcorn and cola for 1.25$ per person\n" +
                "7. Pay items selected\n" +
                "8. Cancel your order\n" +
                "0. Back to main menu"
        );

        helpText();
    }


    public void moviePrice() {
        System.out.println("For 2D movie the price for an adult is 4.75$ " +
                "and for the child the price is 2.5$\n" +
                "For 3D movie the price for an adult is 6.5$ " +
                "and for the child the price is 4$");

        System.out.println("\nSelect a movie : ");
    }

    public void helpPayment() {
        System.out.println("To continue insert an option to select other services\n");
    }


    public void backToMenu() {
        System.out.println("\n0. Back to main menu");

        if (sc.nextLine().equals("0")) {
            printMenu();
        } else {
            System.out.println("Wrong input");
            backToMenu();
        }
    }


}
