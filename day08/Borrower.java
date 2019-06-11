package com.trimind.training.day08;

import java.util.ArrayList;
import java.util.List;

public class Borrower extends BorrowFile
{
    public static ArrayList<BorrowFile> borrowFiles = new ArrayList<>();

    public static void addBorrower(BorrowFile borrowFile){
        BorrowFile.add(borrowFile);
        System.out.println("user details updated");
        System.out.println(borrowFile.toString());
    }
    public static  List<BorrowFile> getAllBorrowerList(){
        return borrowFiles;
    }
}
