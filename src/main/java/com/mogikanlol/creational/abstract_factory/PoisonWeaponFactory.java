package com.mogikanlol.creational.abstract_factory;

import com.mogikanlol.creational.abstract_factory.bow.Bow;
import com.mogikanlol.creational.abstract_factory.bow.PoisonBow;
import com.mogikanlol.creational.abstract_factory.sword.Sword;
import com.mogikanlol.creational.abstract_factory.sword.PoisonSword;

public class PoisonWeaponFactory extends WeaponFactory {
    @Override
    public Sword createSword() {
        return new PoisonSword();
    }

    @Override
    public Bow createBow() {
        return new PoisonBow();
    }
}
