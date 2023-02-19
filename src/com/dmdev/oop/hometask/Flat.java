package com.dmdev.oop.hometask;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Квартира " + flatNumber + ", количество комнат " + rooms.length);
    }
}
