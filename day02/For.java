package com.trimind.training.day02;

import java.util.Scanner;

public class For
{
    public static void main(String[] args) {
        double n, i=0.01, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("The n value is");
        n = sc.nextDouble();
        while (i<=n)
        {
            sum = sum + i;
            i = i + 0.01;
        }
            System.out.println("the sum value  is " + sum);

    }
}
