package com.oop.library;

public class Library {
    Rent[] rents;
    public Library(Rent[] rents) {
        this.rents = rents;

    }

    public Rent getLongestRent() {
        long l = 0;
        Rent lR = null;
        for (Rent rent : rents) {
            long time = rent.end.getTime() - rent.begin.getTime();
            if (time > l) {
                l = time;
                lR = rent;
            }
        }
        return lR;
    }
}
