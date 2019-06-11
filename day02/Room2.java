package com.trimind.training.day02;

import java.util.Scanner;

public class Room2
{
    public static void main(String[] args)
    {
        int lenght;
        int width;
        Scanner s = new Scanner(System.in);
        lenght = s.nextInt();
        width = s.nextInt();
        int area;
        System.out.print("the floor space is  ");
        area=lenght*width;
        System.out.print(area+" square feet");
        //System.out.print("square feet");



    }
}
