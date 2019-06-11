package com.trimind.training.home01;

import java.util.Scanner;

public class Rectangle
{
     public  double length;
     public double width;


    public double area()
    {
        double rectArea;
        System.out.println("enter  length and width");
        Scanner sc = new Scanner(System.in);
        length=sc.nextInt();
        width=sc.nextInt();
        rectArea =  length * width;
        System.out.println("area is" +rectArea);
        return  rectArea;
    }
    public  double perimeter()
    {
        double peri;
        System.out.println("enter perimeter values");
        peri = 2 * (length + width);
        System.out.println("perimeter is" +peri);
       // System.out.println("the perimeter is " +perimeter);
        return  peri;
    }



}
