package com.mogikanlol.creational.factory_method.room;

public class OrdinaryRoom implements Room {

    @Override
    public void connect(Room room) {
        System.out.println("Connecting to Ordinary room");
    }
}
