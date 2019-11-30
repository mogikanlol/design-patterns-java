package com.mogikanlol.creational.abstract_factory.bow;

public class PoisonBow implements Bow {
    @Override
    public void shoot() {
        System.out.println("Shooting with poison");
    }
}
