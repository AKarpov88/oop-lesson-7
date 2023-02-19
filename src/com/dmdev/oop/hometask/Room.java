package com.dmdev.oop.hometask;

public class Room {

    private boolean communication; // false по умолчанию

    public Room(boolean communication) {
        this.communication = communication;
    }

    public void print() {
        if (communication) {
            System.out.println("Комната проходная");
        } else {
            System.out.println("Комната непроходная");
        }
    }
}
