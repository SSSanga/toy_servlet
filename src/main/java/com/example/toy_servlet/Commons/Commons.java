package com.example.toy_servlet.Commons;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Commons {
    public Statement getStatement(){
        String url = "jdbc:mysql://127.0.0.1:3306/db_pollsservlet";
        String user = "root";
        String password ="!yojulab*";
        
        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ok");
        }
        return statement;
    }
}
