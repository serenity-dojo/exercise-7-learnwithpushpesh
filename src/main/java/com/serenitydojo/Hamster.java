package com.serenitydojo;

public class Hamster extends Pet {
    private  String favouriteGame;

    public Hamster(String name, int age, String favouriteGame) {
        super(name, age);
        this.favouriteGame = favouriteGame;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }
}
