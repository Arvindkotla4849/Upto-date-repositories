package com.trimind.training.day02;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        k = sc.nextInt();
        for (i = 1; i <= k; i++) {
            for (j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }

    }
}