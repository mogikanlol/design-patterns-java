package com.mogikanlol.creational.abstract_factory;

import com.mogikanlol.creational.abstract_factory.bow.Bow;
import com.mogikanlol.creational.abstract_factory.sword.Sword;

public abstract class WeaponFactory {

    public abstract Sword createSword();

    public abstract Bow createBow();

    public static WeaponFactory createFactory(WeaponType weaponType) {
        switch (weaponType) {
            case FIRE:
                return new FireWeaponFactory();
            case FROZEN:
                return new FrozenWeaponFactory();
            case POISON:
                return new PoisonWeaponFactory();
            default:
                throw new IllegalArgumentException("Unsupported WeaponType");
        }
    }
}
