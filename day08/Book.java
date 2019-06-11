package com.trimind.training.day08;

public class Book extends BookRental
{
    public static String name;
    public  String title;
    public  int ISBN;
    public  boolean IsAcademic;
    public  int totalcount;

    public Book() {
    }

    public Book(String name, String title, int ISBN, boolean isAcademic, int totalcount)
    {
        this.name = name;
        this.title = title;
        this.ISBN = ISBN;
        this.IsAcademic = isAcademic;
        this.totalcount = totalcount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(int totalcount) {
        totalcount = totalcount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", ISBN=" + ISBN +
                ", IsAcademic=" + IsAcademic +
                ", Totalcount=" + totalcount +
                '}';
    }

    protected static void add(Book book) {
    }

    protected static String getTitle() {
        return null;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAcademic(boolean academic) {
        IsAcademic = academic;
    }
}
