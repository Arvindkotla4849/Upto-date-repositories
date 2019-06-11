package com.trimind.training.day02;

import java.util.Scanner;

public class circle
{
    public static void main(String[] args)
    {
        float radius;
        float area;
        System.out.println("enter radius");
        Scanner scan=new Scanner(System.in);
        radius = scan.nextFloat();
        area = 22/7*radius*radius;
        System.out.println(area);
   }
}
