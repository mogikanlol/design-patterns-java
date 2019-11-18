package com.mogikanlol.creational.builder;

public class Main {

    public static void main(String[] args) {
        Player player = new PlayerBuilder()
                .setName("Hero")
                .setLevel(2)
                .build();

        System.out.println(player);
    }
}
