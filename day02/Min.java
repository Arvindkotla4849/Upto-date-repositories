package com.trimind.training.day02;

public class Min
{
    public static void main(String[] args)
    {
        int minutes = 197;
        int hours;
        System.out.println("convert  minutes into hours and minutes");
        hours = minutes/60;
        minutes = minutes%60;
        System.out.println("hours: "+hours);
        System.out.println("minutes: "+minutes);
    }
}
