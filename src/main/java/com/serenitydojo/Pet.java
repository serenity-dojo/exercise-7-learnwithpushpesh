package com.serenitydojo;

public abstract class Pet {

    private String name;

    public int getAge() {
        return age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public Pet(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public abstract String play();
}
