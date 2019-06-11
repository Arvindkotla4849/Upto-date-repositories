package com.trimind.training.day08;

public class BorrowFile
{
    protected static String firstName;
    protected static String lastName;
    protected static double overDueAmount;
    String Firstname;
    String lastname;
    String email;
    int ISBN;
    int noOfDaysLoan;

    protected static void add(BorrowFile borrowFile) {
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNoOfDaysLoan() {
        return noOfDaysLoan;
    }

    public void setNoOfDaysLoan(int noOfDaysLoan) {
        this.noOfDaysLoan = noOfDaysLoan;
    }

    @Override
    public String toString() {
        return "BorrowFile{" +
                "Firstname='" + Firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", ISBN=" + ISBN +
                ", noOfDaysLoan=" + noOfDaysLoan +
                '}';
    }
}
