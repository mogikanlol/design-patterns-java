package com.mogikanlol.creational.factory_method;

public class Main {

    public static void main(String[] args) {
        EnemyFactory factory = new EnemyFactory();

        System.out.println(factory.createEnemy(1));
        System.out.println(factory.createEnemy(1));
        System.out.println(factory.createEnemy(2));
        System.out.println(factory.createEnemy(2));
    }
}
