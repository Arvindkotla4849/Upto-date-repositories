package com.trimind.training.day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class BookRental {

    Book book=new Book();
    private static Catalog catalog=new Catalog();
    public static  Scanner scanner=new Scanner(System.in);

    public static void addBook(Book book) {
        System.out.println(book.toString());

    }
    public void receiveBook() {

    }
    public BookRental() {
    }

    public BookRental(String name, String title, int isbn, boolean isAcademic, int totalcount)
    {

    }
    public static void main(String[] args) {


        System.out.println("********Welcome to Book Rental System *********");
        System.out.println("[1].Add Book Details");
        System.out.println("[2].print book details");
        System.out.println("[3].Delete Book From Catalog");
        System.out.println("[4].search for a book");
        System.out.println("[5].Rent a Book");
        System.out.println("[6].Return a Book");
        System.out.println("[7].print out Borrower List");
        System.out.println("[8].Exit The Program");
        System.out.println("*************************************************");
        System.out.println("enter ur choice");

        Book book1=new Book();

        int option=0;

        option = scanner.nextInt();

        do {
            switch (option) {

                case 1:

                    book1.addBooks(book1);
                    break;

                case 2:
                    printBookDetails();
                    break;

                case 3:

                    deleteBook();
                    break;

                case 4:

                    searchBook();
                    break;

                case 5:

                    Catalog.rentBook();
                    break;

                case 6:
                    Catalog.returnBook();
                    break;

                case 7:
                    printBorrowerList();
                    break;

                default:
                    System.out.println("enter an valid option");

            }
            scanner.nextLine();
            System.out.println("enter ur choice");
            option=scanner.nextInt();
            scanner.nextLine();

        } while (option!=0);


    }

    public static void printBookDetails() {
        System.out.println(catalog.getAllBooks().toString());
    }
    public static void printBorrowerList()
    {
        System.out.println(Borrower.getAllBorrowerList().toString());
    }

    public void addBooks(Book book)
    {

        //Book book=new Book();
        System.out.println("enter the authors name");
        book.name=scanner.next();
        System.out.println("enter book title");
        book.title=scanner.next();
        System.out.println("enter book isbn");
        book.ISBN=scanner.nextInt();
        System.out.println("enter book stock");
        book.totalcount=scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter 0 for nonAcademic or 1 forAcademic");
        if (scanner.hasNextBoolean()) {
            book.IsAcademic = true;
        } else {
            book.IsAcademic = false;
            System.out.println("enter book name");
        }
        catalog.addBook(book);
        System.out.println("the book has been added");
        System.out.println(book.toString());

    }
    public static Book searchBook()
    {
        System.out.println("enter the book name that u wantto search");
        String bookName=scanner.next();
        Book book=catalog.searchBook(bookName);
        return book;
    }

    public static void deleteBook(){
        Book book=searchBook();
        if (book == null) {
            System.out.println("the book not in the store");
        }else{
            catalog.deleteBook(book);
            System.out.println("the book is deleted");
        }
    }

}