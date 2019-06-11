package com.trimind.training.day02;

import java.util.Scanner;

public class Divsibility {
    public static void main(String[] args) {
        int number;

        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        number = s.nextInt();

        if (number % 2 == 0 && number % 3 ==0) {
            System.out.println("hello world ");
        } else if (number % 3 == 0)
            System.out.println("world");
          else if (number % 2 ==0 )
            System.out.println("hello ");
        }


    }
