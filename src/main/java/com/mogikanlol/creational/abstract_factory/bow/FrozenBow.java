package com.mogikanlol.creational.abstract_factory.bow;

public class FrozenBow implements Bow {
    @Override
    public void shoot() {
        System.out.println("Shooting with frozen water");
    }
}
