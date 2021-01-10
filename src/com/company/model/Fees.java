package com.company.model;

public class Fees {
    private double adult;
    private double child;
    private double popcornAndCola;
    private double student;
    private double totalCost;

    public Fees() {
        this.popcornAndCola = 1.25;
    }

    public Fees(double adult, double child, double student) {
        this.adult = adult;
        this.child = child;
        this.student = student;
        this.popcornAndCola = 1.25;
    }

    public double getAdult() {
        return adult;
    }

    public double getChild() {
        return child;
    }

    public double getPopcornAndCola() {
        return this.popcornAndCola;
    }

    public double getStudent() {
        return student;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setAdult(double adult) {
        this.adult = adult;
    }

    public void setChild(double child) {
        this.child = child;
    }

    public void setStudent(double student) {
        this.student = student;
    }


    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
