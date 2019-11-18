package com.mogikanlol.creational.builder;

public class PlayerBuilder {

    private int level;

    private String name;

    public PlayerBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Player build() {
        return new Player(this.level, this.name);
    }

}
