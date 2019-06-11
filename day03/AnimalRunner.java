package com.trimind.training.day03;

public class AnimalRunner
{
    public static void main(String[] args)
    {
      Animal lion = new Animal ( "green", "king", true);
        lion.setName("black");
        System.out.println(lion.getName());
        /*lion.running();
        lion.sleeping();
        lion.eating();*/
        System.out.println(lion);
    }
}
