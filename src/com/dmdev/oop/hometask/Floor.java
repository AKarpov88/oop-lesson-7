package com.dmdev.oop.hometask;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print() {
        System.out.println("Этаж " + floorNumber + ", количество квартир " + flats.length);
    }
}
