package com.trimind.training.day03;

public class Animal
{

    public Animal(String color, String name, boolean isCarnivorous) {
        this.color = color;
        this.name = name;
        this.isCarnivorous = isCarnivorous;
    }

    private String color;
     private   String name;
     private   boolean isCarnivorous;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
