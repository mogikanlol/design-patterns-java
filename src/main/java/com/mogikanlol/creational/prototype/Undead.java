package com.mogikanlol.creational.prototype;

public class Undead implements Enemy {

    private String name;
    private int health;

    public Undead(String name) {
        this.name = name;
        this.health = 5;
    }
    public Enemy copy() {
        return new Undead(this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Undead undead = (Undead) o;

        if (health != undead.health) return false;
        return name != null ? name.equals(undead.name) : undead.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + health;
        return result;
    }

    @Override
    public String toString() {
        return "Undead{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
