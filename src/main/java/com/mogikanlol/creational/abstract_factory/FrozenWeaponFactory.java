package com.mogikanlol.creational.abstract_factory;

import com.mogikanlol.creational.abstract_factory.bow.Bow;
import com.mogikanlol.creational.abstract_factory.bow.FrozenBow;
import com.mogikanlol.creational.abstract_factory.sword.Sword;
import com.mogikanlol.creational.abstract_factory.sword.FrozenSword;

public class FrozenWeaponFactory extends WeaponFactory {
    @Override
    public Sword createSword() {
        return new FrozenSword();
    }

    @Override
    public Bow createBow() {
        return new FrozenBow();
    }
}
