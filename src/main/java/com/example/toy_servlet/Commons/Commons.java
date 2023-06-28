package com.example.toy_servlet.Commons;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;



public class Commons {
    public Statement getStatement(){
        
        String url = "jdbc:mysql://127.0.0.1:3306/db_pollsservlet";
        String user = "root";
        String password ="!yojulab*";
        // String url = "jdbc:mysql://192.168.0.224:3306/db_pollsservlet";
        // String user = "yojulab";
        // String password ="!yojulab*";
        
        
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

        public String getGeneratorID(){
        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyyhh:mm:ss");  
        String strDate = formatter.format(date);
        return strDate;
    }
    public String generateUUID() {
        
        return UUID.randomUUID().toString();
}
}

