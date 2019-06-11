package com.trimind.training.day02;

import java.util.Scanner;

public class Arith
{
    //int tax=10;
    public static void single(int sal)
    {
        if (sal <= 6000){
            int tax = (sal * 10) / 100;
            System.out.println(tax);
    }
         else if ((sal>6000)&& (sal<27950)) {
            int tax = (sal * 15) / 100;
            System.out.println(tax);
        }
         else {
            int tax = (sal * 27) / 100;
            System.out.println(tax);
        }


    }
   /* public static  int married(int sal)
    {
        if(sal <12000)
           int tax = (sal * 10) / 100;
           System.out.println(tax);

         else if((sal<12000) && (sal>46700));
        System.out.println(tax);

    }
    public static  int marriedSeperated(int sal)

    {
        if(sal<6000)
            int tax = (sal * 10) /100;
            System.out.println(tax);
         else if ((sal>6000 && sal <23350))
            System.out.println(tax);
    }
    public static int headHousehold(int sal)
    {
        if(sal<10000)
            int tax = (sal * 10)/ 100;
            System.out.printf(tax);
         else if ((sal>10000) && sal<37540)
            System.out.println(tax);
    }
*/
    public static void main(String[] args)
    {
        System.out.println("for 1 single");
      /*  System.out.println("for 2 married");
        System.out.println("married seperated");
        System.out.println("headhousehold");*/
      int choice;


    }
}
