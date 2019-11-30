package com.mogikanlol.creational.abstract_factory.sword;

public class PoisonSword implements Sword {
    @Override
    public void doDamage() {
        System.out.println("Damaging with poison");
    }
}
