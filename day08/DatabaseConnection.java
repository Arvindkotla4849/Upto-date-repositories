package com.trimind.training.day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
    public static Connection con;
    static{
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/king","root","root");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    static Connection getCon(){
        return con;
    }
}
