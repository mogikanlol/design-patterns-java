package com.mogikanlol.creational.singleton;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
