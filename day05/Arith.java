package com.trimind.training.day05;

import java.util.Scanner;

public class Arith
{
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String name");
        name=sc.nextLine();
        System.out.println("enter age");
        try{
            age=sc.nextInt();

        }catch( Exception exception){
            System.out.println("please enter numeric values");
        }

    }
}
