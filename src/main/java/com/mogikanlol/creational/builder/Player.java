package com.mogikanlol.creational.builder;

public class Player {

    private final int level;

    private final String name;

    public Player(int level, String name) {
        this.level = level;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player [level = " + level + ", name = " + name + "]";
    }
}
