package com.company.utils;

import com.company.model.Fees;
import com.company.privilege.UserPrivilege;

public class Cart {


    Fees fees = new Fees();
    BuyTicket2D buyTicket2D = new BuyTicket2D();
    BuyTicket3D buyTicket3D = new BuyTicket3D();


    public void adultTicket() {
        {
            if (!UtilsService.selectedMovie.isIs3D()) {
                UserPrivilege.totalCost += buyTicket2D.adultTicket();
                System.out.println("You choose 1 adult ticket for the price of " + buyTicket2D.adultTicket() +
                        "\nTotal cost : " + UserPrivilege.totalCost + "$");
            } else {
                UserPrivilege.totalCost += buyTicket3D.adultTicket();
                System.out.println("You choose 1 adult ticket for the price of " + buyTicket3D.adultTicket() +
                        "\nTotal cost : " + UserPrivilege.totalCost + "$");
            }
        }
    }

    public void childTicket() {
        if (!UtilsService.selectedMovie.isIs3D()) {
            UserPrivilege.totalCost += buyTicket2D.childTicket();
            System.out.println("You choose 1 child ticket for the price of " + buyTicket2D.childTicket() +
                    "\nTotal cost : " + UserPrivilege.totalCost + "$");
        } else {
            UserPrivilege.totalCost += buyTicket3D.childTicket();
            System.out.println("You choose 1 child ticket for the price of " + buyTicket3D.childTicket() +
                    "\nTotal cost : " + UserPrivilege.totalCost + "$");
        }
    }

    public void familyTicket() {
        if (!UtilsService.selectedMovie.isIs3D()) {
            UserPrivilege.totalCost += buyTicket2D.familyTicket();
            System.out.println("You choose 1 child ticket for the price of " + buyTicket2D.familyTicket() +
                    "\nTotal cost : " + UserPrivilege.totalCost + "$");
        } else {
            UserPrivilege.totalCost += buyTicket3D.familyTicket();
            System.out.println("You choose 1 child ticket for the price of " + buyTicket3D.familyTicket() +
                    "\nTotal cost : " + UserPrivilege.totalCost + "$");
        }
    }

    public void loverTicket() {
        if (!UtilsService.selectedMovie.isIs3D()) {
            UserPrivilege.totalCost += buyTicket2D.loversTicket();
            System.out.println("You choose 1 child ticket for the price of " + buyTicket2D.loversTicket() +
                    "\nTotal cost : " + UserPrivilege.totalCost + "$");
        } else {
            UserPrivilege.totalCost += buyTicket3D.loversTicket();
            System.out.println("You choose 1 child ticket for the price of " + buyTicket3D.loversTicket() +
                    "\nTotal cost : " + UserPrivilege.totalCost + "$");
        }
    }

    public void studentTicket() {
        if (!UtilsService.selectedMovie.isIs3D()) {
            UserPrivilege.totalCost += buyTicket2D.studentTicket();
            System.out.println("You choose 1 child ticket for the price of " + buyTicket2D.studentTicket() +
                    "\nTotal cost : " + UserPrivilege.totalCost + "$");
        } else {
            UserPrivilege.totalCost += buyTicket3D.childTicket();
            System.out.println("You choose 1 child ticket for the price of " + buyTicket3D.studentTicket() +
                    "\nTotal cost : " + UserPrivilege.totalCost + "$");
        }
    }

    public void popcornAndCola() {
        UserPrivilege.totalCost += fees.getPopcornAndCola();
        System.out.println("You choose 1 child ticket for the price of " + fees.getPopcornAndCola() +
                "\nTotal cost : " + UserPrivilege.totalCost + "$");
    }

}
