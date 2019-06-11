package com.trimind.training.day02;

import java.util.Scanner;

public class Max
{
    public static void main(String[] args)
    {
        int x;
        //i cal;
        Scanner king = new Scanner(System.in);
        System.out.println("enter x value");
        x=king.nextInt();
        String cal= ( x % 2 ==0) ? x+" is even" : x+" is odd";
        //System.out.println("");
        System.out.println("the value is "+cal);
    }
}
