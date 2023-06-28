package com.example.toy_servlet.Daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import com.example.toy_servlet.Commons.Commons;
import com.mysql.cj.protocol.Resultset;

public class PollsID_PW {
    public HashMap<String, String> selectAll() {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT ID, PASSWORD\n" +
                    " FROM respondents ;";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                hashMap.put(resultSet.getString("ID"), resultSet.getString("PASSWORD"));
            }
            
            resultSet.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return hashMap;
    }
}