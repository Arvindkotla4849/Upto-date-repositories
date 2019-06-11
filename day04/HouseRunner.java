package com.trimind.training.day04;

public class HouseRunner
{
    public static void main(String[] args)
    {
        House hs = new House("kotla",'x',2,3,false);
        House h1 = new House("kotla" ,4,6);
        House h2= new House();
         hs.setType("Apartment");
         hs.setZone('A');
         hs.setPrice(68000.0);
         hs.setNoOfBedrooms(3);
         hs.setFreehold(false);

        House[] houseArray =new House[3];
        houseArray[0] = hs;
        System.out.println(hs.toString());
        houseArray[1] = h1;
        System.out.println(h1.toString());
        houseArray[2] =h2;
        System.out.println(h2.toString());

    }
}
