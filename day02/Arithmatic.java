package com.trimind.training.day02;

import java.util.Scanner;
public class Arithmatic
{
    public static void main(String[] args)
    {
        int p,q ,add, sub, mul,div;
        double mod;
        char choice;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        p = s.nextInt();
        System.out.print("Enter second number:");
        q  = s.nextInt();
        if(true)
        {
            System.out.println("for add type +");
            System.out.println("for sub type -");
            System.out.println("for mul type *");
            System.out.println("for div type /");
            System.out.println("for mod type %");
            choice =  s.next().charAt(0);
            switch(choice)
            {
                case '+':
                    add = p + q;
                    System.out.println("Result:"+add);
                    break;

                case  '-':
                    sub = p - q;
                    System.out.println("Result:"+sub);
                    break;

                case '*':
                    mul = p * q;
                    System.out.println("Result:"+mul);
                    break;

                case '/':
                    div = p / q;
                    System.out.println("Result:"+div);
                    break;

                 case '%':
                     mod = p % q;
                     System.out.println("Result:"+mod);
                     break;


            }
        }
    }
}