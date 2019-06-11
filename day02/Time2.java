package com.trimind.training.day02;

import java.util.Scanner;

public class Time2
{
    public static void main(String[] args)
    {
        int minutes;
        int hours;
        System.out.println("convert  minutes into hours and minutes");
        Scanner s = new Scanner(System.in);
        hours=s.nextInt();
        minutes=s.nextInt();
        hours=minutes/60;
        minutes=minutes%60;
        System.out.println("hours:"+hours);
        System.out.println("minutes:"+minutes);
    }
}
