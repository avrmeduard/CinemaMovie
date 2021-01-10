package com.company.utils;

import com.company.model.Fees;

public class BuyTicket2D {

    Fees fees = new Fees(4.75, 2.5, 4.75 / 2);

    public double adultTicket() {
        return fees.getAdult();
    }

    public double childTicket() {
        return fees.getChild();
    }

    public double loversTicket() {
        return fees.getAdult() * 2;
    }

    public double studentTicket() {
        return fees.getStudent();
    }

    public double familyTicket() {
        return loversTicket() + childTicket();
    }
}
