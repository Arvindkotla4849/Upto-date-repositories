package com.trimind.training.day04;

public class House
{
    public  String type;
    public char Zone;
    public double price;
    public  int noOfBedrooms;
    public boolean freehold;

    public  House()
    {

    }

    public House(String type, double price, int noOfBedrooms) {
        this.type = type;
        this.price = price;
        this.noOfBedrooms = noOfBedrooms;
    }

    public House(String type, char zone, double price, int noOfBedrooms, boolean freehold) {
        this.type = type;
        Zone = zone;
        this.price = price;
        this.noOfBedrooms = noOfBedrooms;
        this.freehold = freehold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getZone() {
        return Zone;
    }

    public void setZone(char zone) {
        Zone = zone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public boolean isFreehold() {
        return freehold;
    }

    public void setFreehold(boolean freehold) {
        this.freehold = freehold;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", Zone=" + Zone +
                ", price=" + price +
                ", noOfBedrooms=" + noOfBedrooms +
                ", freehold=" + freehold +
                '}';
    }
}
