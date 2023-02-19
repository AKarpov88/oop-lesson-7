package com.dmdev.oop.hometask;

/**
 * Представить в виде классов и их композиции следующую модель.
 *
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 *
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 *
 * Например, метод print класса этаж должен выводить на консоль:
 *
 * “Этаж 2, количество квартир 18”
 *
 * Создание всех объектов вынести в отдельный класс с методом main.
 *
 * Тамже реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем,
 * его этажах, квартирах и комнатах, вызывая методы print.
 */

public class HouseRunner {

    public static void main(String[] args) {
        Room room111 = new Room(true);
        Room room112 = new Room(false);
        Room room113 = new Room(false);
        Room room221 = new Room(true);
        Room room331 = new Room(false);
        Room room341 = new Room(true);

        Flat flat1 = new Flat(1, new Room[]{room111, room112, room113});
        Flat flat2 = new Flat(2, new Room[]{room221});
        Flat flat3 = new Flat(3, new Room[]{room331});
        Flat flat4 = new Flat(4, new Room[]{room341});

        Floor floor1 = new Floor(1, new Flat[]{flat1});
        Floor floor2 = new Floor(2, new Flat[]{flat2, flat3});
        Floor floor3 = new Floor(3, new Flat[]{flat4});

        House house = new House(1, new Floor[]{floor1, floor2, floor3});

        printAllInformation(house);
    }

    private static void printAllInformation(House house) {
        house.print();
        System.out.println();
        Floor[] floors = house.getFloors();
        for (Floor floor : floors) {
            floor.print();
            System.out.println();
            Flat[] flats = floor.getFlats();
            for (Flat flat : flats) {
                flat.print();
                Room[] rooms = flat.getRooms();
                for (Room room : rooms) {
                    room.print();
                }
                System.out.println();
            }
        }
    }
}
