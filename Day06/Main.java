package com.trimind.training.Day06;

import jdk.nashorn.internal.ir.CatchNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main
{

    public static void main(String[] args)
    {
       try {
           File file = new File("KING.txt");

           if (file.createNewFile())
               System.out.println("FILE CREATION IS SUCESSFUL");
           else
               System.out.println("file already exist");

           String st;
           BufferedReader br = new BufferedReader(new FileReader("KING.txt"));
           System.out.println( br.readLine());
           /*while ((st = br.readLine()) != null)
               System.out.println("THE READING FILE IS "+st);*/


       }

        catch(IOException ie){
        ie.printStackTrace();
    }

    }
}
