package com.example.toy_servlet.Daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.toy_servlet.Commons.Commons;

// 각자 필요한 DB의 Method? 구문 쓰기. 
// 참고_with Teacher OptioninforsDao.java, FactorysDao.java

public class PollsDao {
    // db 연결 및 statement(=editor), String query까지 포함.
    Commons commons = new Commons();
    Statement statement = commons.getStatement();
    String query = "";

    // public ArrayList pollQuestion() {
    //     ArrayList arraylist = new ArrayList();
    //     try { // 질문과 답항을 불러오자
    //           // 2. 질문을 불러온다.
    //           // 참고 FactorysDao.java
    //           // 질문을 1개 부른 다음 pollAnswer를 hashmap으로 푼다.
    //           //구지 이렇게 안해도 되는듯. 
    //           query = "";
    //           ResultSet resultset = statement.executeQuery(query);
    //         HashMap hashmap = new HashMap<>();
    //         while (resultset.next()) {
    //             hashmap = new HashMap();
    //             hashmap.put("QUESTIONS", resultset.getString("QUESTIONS"));
    //             arraylist.add(hashmap);
    //         }
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    //     return arraylist;
    // }

    // public ArrayList pollAnswer() {
    //     // 질문과 답항을 불러오자
    //     // 1. 먼저 답을 불러오자_hashmap을 arraylist로 넣는다.
    //     // 참고 FactorysDao.java
        
    //     ArrayList arraylist = new ArrayList();
    //     Commons commons = new Commons();
    //     Statement statement = commons.getStatement();
    //     String query = "";

    //     try {
    //         query = "SELECT CHOICE FROM choice;";
    //         ResultSet resultset = statement.executeQuery(query);
    //         HashMap<String, String> hashmap = new HashMap<>();
    //         while (resultset.next()) {
    //             hashmap = new HashMap();
    //             hashmap.put("CHOICE", resultset.getString("CHOICE"));
    //             arraylist.add(hashmap);
    //         }

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    //     return arraylist;
    // }

    // 회원리스트 메소드(혜인)
    public ArrayList SelectMembers() {
        ArrayList membersList = new ArrayList<>();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT *\n" + //
                    "FROM db_pollsservlet.respondents;";
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);

            HashMap<String, String> members = new HashMap<>();
            while(resultSet.next()) {
                members = new HashMap<>();
                members.put("ID", "ID");
                members.put("RESPONDENTS", "RESPONDENTS");
                members.put("PASSWORD", "PASSWORD");
                members.put("AGE", "AGE");
                members.put("GENDER", "GENDER");
                members.put("ADDRESS", "ADDRESS");

                membersList.add(members);

            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return membersList;
    }

    public ArrayList InfoMembers(String name) {
        ArrayList membersList = new ArrayList<>();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT *\n" + //
                    "FROM respondents\n" + //
                    "WHERE RESPONDENTS LIKE '"+name+"';";
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);

            HashMap<String, String> members = new HashMap<>();
            while(resultSet.next()) {
                members = new HashMap<>();
                members.put("ID", resultSet.getString("ID"));
                members.put("RESPONDENTS", resultSet.getString("RESPONDENTS"));
                members.put("PASSWORD", resultSet.getString("PASSWORD"));
                members.put("AGE", resultSet.getString("AGE"));
                members.put("GENDER", resultSet.getString("GENDER"));
                members.put("ADDRESS", resultSet.getString("ADDRESS"));

                membersList.add(members);

            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return membersList;
    }
}
