package com.trimind.training.day02;

import java.util.Scanner;

public class Values {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        number=s.nextInt();
        System.out.println("please enter number");
        if (number > 0 && number < 100) {
            System.out.println("the value is bet 1 to 100");
        }

        System.out.println("the value is not bet 100");
    }
}