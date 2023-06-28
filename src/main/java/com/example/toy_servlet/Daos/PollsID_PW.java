package com.example.toy_servlet.Daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import com.example.toy_servlet.Commons.Commons;

public class PollsID_PW {
    public HashMap selectAll() {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT ID, PASSWORD\n" + //
                    " FROM respondents ;";
            ResultSet resultset = statement.executeQuery(query);
            if (resultset.next()) {
                hashMap.put("ID", resultset.getString("ID"));
                hashMap.put("PASSWORD", resultset.getString("PASSWORD"));
            }
            resultset.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return hashMap;
    }
}

