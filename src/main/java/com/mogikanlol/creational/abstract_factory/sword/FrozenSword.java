package com.mogikanlol.creational.abstract_factory.sword;

public class FrozenSword implements Sword {
    @Override
    public void doDamage() {
        System.out.println("Damaging with frozen water");
    }
}
