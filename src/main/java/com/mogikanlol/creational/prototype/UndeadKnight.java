package com.mogikanlol.creational.prototype;

public class UndeadKnight implements Enemy {

    private String name;
    private int health;

    public UndeadKnight(String name) {
        this.name = name;
        this.health = 10;
    }

    public Enemy copy() {
        return new UndeadKnight(this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UndeadKnight that = (UndeadKnight) o;

        if (health != that.health) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + health;
        return result;
    }

    @Override
    public String toString() {
        return "DragonKnight{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
