package com.mogikanlol.creational.factory_method;

import com.mogikanlol.creational.factory_method.enemy.Enemy;
import com.mogikanlol.creational.factory_method.enemy.Undead;
import com.mogikanlol.creational.factory_method.enemy.UndeadKnight;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EnemyFactory {

    private final Map<Integer, Supplier<Enemy>> enemies;

    public EnemyFactory() {
        enemies = new HashMap<>();
        enemies.put(1, Undead::new);
        enemies.put(2, UndeadKnight::new);
    }

    public Enemy createEnemy(int level) {
        Supplier<Enemy> enemySupplier = enemies.get(level);
        return enemySupplier.get();
    }
}
