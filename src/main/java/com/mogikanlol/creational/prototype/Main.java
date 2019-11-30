package com.mogikanlol.creational.prototype;

public class Main {

    public static void main(String[] main) {

        Enemy enemy = new Undead("Crawler");

        Enemy copy = enemy.copy();

        System.out.println(enemy.equals(copy));
    }
}
