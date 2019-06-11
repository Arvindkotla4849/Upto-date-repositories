package com.trimind.training.day02;

import java.util.Scanner;

public class Sumofint
{
    public static void main(String[] args)
    {
      int k,sum=0;
      do {

          Scanner kotla = new Scanner(System.in);
          System.out.println("enter k value");
          k = kotla.nextInt();
          sum = sum + k;
      } while (k!=0);

            System.out.println("end");


    }
}
