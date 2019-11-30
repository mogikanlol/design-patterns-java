package com.mogikanlol.creational.abstract_factory;

import com.mogikanlol.creational.abstract_factory.bow.Bow;
import com.mogikanlol.creational.abstract_factory.sword.Sword;

public class Main {

    public static void main(String[] args) {
        testWeapons(WeaponType.FIRE);
        testWeapons(WeaponType.FROZEN);
        testWeapons(WeaponType.POISON);
    }

    public static void testWeapons(WeaponType weaponType) {
        System.out.println("Using weapon with type = " + weaponType);

        WeaponFactory factory = WeaponFactory.createFactory(weaponType);

        Bow bow = factory.createBow();
        Sword sword = factory.createSword();

        bow.shoot();
        sword.doDamage();

        System.out.println("<--------------------->");
    }

}
