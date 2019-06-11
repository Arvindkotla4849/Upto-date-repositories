package com.trimind.training.day02;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Filestatus
{
    public static void main(String[] args)
    {
       int salary;
       int taxrate;
      // String filingstatus;
        Scanner you = new Scanner(System.in);
        System.out.println("enter salary amount");
        salary=you.nextInt();
        System.out.println("enter tax rate");
        taxrate=you.nextInt();

        switch(salary) {
            case 1:
                if(salary<6000 &&  taxrate<10)
                   System.out.println("single filers ");

                break;
            case 2:
                System.out.println("company pays 4.65 ");
                break;
            case 3:
                System.out.println("company pays 7.85");
                break;
            case 4:
                System.out.println("company pays 5.50");
                break;
             default:
            System.out.println("error");
        }


    }
}
