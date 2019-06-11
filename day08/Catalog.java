package com.trimind.training.day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Catalog extends Book
{
    public ArrayList<Book> books1=new ArrayList<>();
    public static Map<String,Book> bookMap=new HashMap<>();

    static Scanner sc = new Scanner(System.in);
    public static void addBook(Book book){
        book.add(book);
        System.out.println("the book has been added");
        //String bookName=sc.next();
        bookMap.put(book.getName(),book);

    }
    public static Map<String,Book> getAllBooks(){
        return bookMap;
    }
    public static void deleteBook(Book b){
         name=b.getTitle();
        bookMap.remove(name);
    }

    public Book searchBook(String bookName){
        if(!bookMap.containsKey(bookName)){
            System.out.println("the book is not in store");
        }
        else {
            Book book=bookMap.get(bookName);
            System.out.println("the book details are \n" +book.toString());
            return book;
        }
        return null;
    }
    public static void rentBook(){
        Book book= BookRental.searchBook();
        if(book==null){
            System.out.println("the book is not in store");
        }else {
            System.out.println("enter the borrower details");
            BookRental.printBorrowerList();
            String bookName=book.getTitle();
            bookMap.remove(bookName);
            System.out.println("the book has been rented");
        }


    }
    public static void returnBook(){
        BookRental.printBorrowerList();
        System.out.println("enter the no of days that u hae rented the book");
        int days=sc.nextInt();
        LoanRate.setAmount(days);
        System.out.println("amount displaying is ");
        LoanRate.getAmount();
        System.out.println("over due amount is");
        LoanRate.getOverDueAmount();
        System.out.println("the book is returned");
    }
    public void saveBook(){

    }
}
