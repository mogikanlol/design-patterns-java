package com.mogikanlol.creational.abstract_factory;

import com.mogikanlol.creational.abstract_factory.bow.Bow;
import com.mogikanlol.creational.abstract_factory.bow.FireBow;
import com.mogikanlol.creational.abstract_factory.sword.Sword;
import com.mogikanlol.creational.abstract_factory.sword.FireSword;

public class FireWeaponFactory extends WeaponFactory {
    @Override
    public Sword createSword() {
        return new FireSword();
    }

    @Override
    public Bow createBow() {
        return new FireBow();
    }
}
