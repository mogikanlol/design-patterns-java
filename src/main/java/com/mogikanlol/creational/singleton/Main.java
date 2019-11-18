package com.mogikanlol.creational.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setValue(100);

        System.out.println(singleton.getValue());

        singleton = Singleton.getInstance();
        System.out.println(singleton.getValue());
    }

}
