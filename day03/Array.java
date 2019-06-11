package com.trimind.training.day03;

import java.io.PrintStream;

public class Array
{
    public static void main(String[] args)
    {

      String[] names = {"aru","viru","niru"};

      printNames(names);
    }

    public static void printNames(String[] names)
    {
        for (String name: names)
        {
            System.out.println(name);
        }
    }
}
