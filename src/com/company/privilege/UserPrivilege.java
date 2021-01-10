package com.company.privilege;

import com.company.Main;
import com.company.Menu;
import com.company.model.Fees;
import com.company.model.Movie;
import com.company.utils.BuyTicket2D;
import com.company.utils.BuyTicket3D;
import com.company.utils.Cart;
import com.company.utils.UtilsService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserPrivilege {

    Scanner sc = new Scanner(System.in);
    boolean quit = false;

    UtilsService utilsService = new UtilsService();
    Menu menu = new Menu();

    Fees fees = new Fees();
    BuyTicket2D buyTicket2D = new BuyTicket2D();
    BuyTicket3D buyTicket3D = new BuyTicket3D();
    Cart cart = new Cart();

    public static double totalCost;


    public void menuOption() {
        menu.printMenu();
        menu.helpText();
        try {
            while (!quit) {

                switch (sc.nextInt()) {
                    case 0:
                        menu.backToMenu();
                    case 1:
                        utilsService.printMovie();
                        menu.backToMenu();
                        break;
                    case 2:
                        System.out.println("\n2D Movies for tonight are : ");
                        utilsService.show2DMovie();
                        menu.backToMenu();
                        break;
                    case 3:
                        System.out.println("\n3D Movies for tonight are : ");
                        utilsService.show3DMovie();
                        menu.backToMenu();
                        break;
                    case 4:
                        utilsService.showMovieByGenre();
                        menu.backToMenu();
                        break;
                    case 5:
                        utilsService.buyATicket();
                        menu.moviePrice();
                        menu.ticketMenu();

                        ticketOption(utilsService.selectedMovie);
                        break;
                    case 6:
                        System.out.println("\nPlease give a feedback for better customer service" +
                                "\nSee you again !!");
                        System.exit(0);
                    default:
                        System.out.println("Wrong input");
                        menu.printMenu();
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Letters are not allowed !");
            sc.nextLine();
            menuOption();
            sc.nextInt();

        }

    }

    public void ticketOption(Movie movie) {
        try {
            switch (sc.nextInt()) {

                case 1:
                    cart.adultTicket();
                    menu.helpPayment();
                    ticketOption(utilsService.selectedMovie);
                    break;
                case 2:
                    cart.childTicket();
                    menu.helpPayment();
                    ticketOption(utilsService.selectedMovie);
                    break;
                case 3:
                    cart.familyTicket();
                    menu.helpPayment();
                    ticketOption(utilsService.selectedMovie);
                    break;
                case 4:
                    cart.loverTicket();
                    menu.helpPayment();
                    ticketOption(utilsService.selectedMovie);
                    break;
                case 5:
                    cart.studentTicket();
                    menu.helpPayment();
                    ticketOption(utilsService.selectedMovie);
                    break;
                case 6:
                    cart.popcornAndCola();
                    menu.helpPayment();
                    ticketOption(utilsService.selectedMovie);
                    break;
                case 7:
                    System.out.println("Your bill it is " + totalCost + "$." + "\nPlease insert money !");
                    if (sc.nextDouble() == totalCost) {
                        String ticketNr = movie.getTitle().substring(0, 1) + ((int) ((Math.random() * 999) + 256));
                        System.out.println("Enjoy movie " + movie.getTitle() + "\nYou ticket barcode it is " + ticketNr);

                        System.out.println("\nWe wish you a lovely day");
                        System.exit(0);
                    }
                    break;
                case 8:
                    totalCost = 0;
                    System.out.println("Order canceled");
                    System.out.println("Your bill it is " + totalCost + "$.");
                    menuOption();
                    break;
                case 0:
                    System.out.println("Your bill it is " + totalCost + "$.");
                    menuOption();
                    break;
                default:
                    System.out.println("Wrong input");
                    ticketOption(utilsService.selectedMovie);
                    break;

            }

        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
            menu.helpText();
            System.out.println("Your bill it is " + totalCost + "$.");

            sc.nextLine();
            ticketOption(utilsService.selectedMovie);
            sc.nextInt();
        }

    }


}
