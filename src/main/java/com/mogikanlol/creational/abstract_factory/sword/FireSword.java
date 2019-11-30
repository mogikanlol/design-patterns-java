package com.mogikanlol.creational.abstract_factory.sword;

public class FireSword implements Sword {
    @Override
    public void doDamage() {
        System.out.println("Damaging with fire");
    }
}
