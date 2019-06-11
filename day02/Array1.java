package com.trimind.training.day02;

import java.util.Scanner;

public class Array1
{
    public static void main(String[] args)
    {
     int[] arr={10,20,30,40,50};
        int sum = 0;

        for( int num =0; num<arr.length;num++) {
            sum = sum+arr[num];
        }
        System.out.println("Sum of array elements is:"+sum);
    }
    }

