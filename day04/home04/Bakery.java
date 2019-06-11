package com.trimind.training.day04.home04;

import java.util.Scanner;

public class Bakery
{
    public String flavour;
    public int weight;
    public int quantity;
    public double price;

   /* Bakery()
    {
        this.flavour="StrawBerry";
        this.weight=1;
        this.quantity=1;
    }*/
    Bakery()
    {
        this.flavour=flavour;
        this.weight=weight;
        this.quantity=quantity;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "flavour='" + flavour + '\'' +
                ", weight='" + weight + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public  void order()
    {
        int mywish;
        System.out.println("enter your choice ");
        Scanner king = new Scanner(System.in);
        mywish=king.nextInt();
        switch (mywish)
        {
            case 1: this.flavour="chocolate moist";
            break;
            case 2:  this.flavour="starwBerry";
            break;
            case 3: this.flavour="American chocolate";
            break;
            default:
                System.out.println("please choose correct option");
        }
        System.out.println("enter weight of cake(1kg,2kg,3kg):");
        this.weight =king.nextInt();
        System.out.println("enter ordered quantity");
        this.quantity =king.nextInt();
    }

}
