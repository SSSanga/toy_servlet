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
    // Commons commons = new Commons ();
    // Statement statement = commons.getStatement();
    // String query = "";

    public ArrayList selectAll() {
        ArrayList arraylist = new ArrayList();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "";
            // 모든 정답을 불러오자
            query = "SELECT * FROM choice";
            ResultSet resultset = statement.executeQuery(query);
            HashMap hashmap = new HashMap<>();
            while (resultset.next()) {
                hashmap = new HashMap();
                hashmap.put("CHOICE_ID", resultset.getString("CHOICE_ID"));
                hashmap.put("CHOICE", resultset.getString("CHOICE"));
                arraylist.add(hashmap);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arraylist;
    }

    public ArrayList SelectQuest() {
        ArrayList arraylist = new ArrayList();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "";
            query = "SELECT * FROM questions";
            ResultSet resultset = statement.executeQuery(query);
            HashMap hashmap = new HashMap<>();
            while (resultset.next()) {
                hashmap = new HashMap();
                hashmap.put("QUESTIONS", resultset.getString("QUESTIONS"));
                hashmap.put("QUESTIONS_ID", resultset.getString("QUESTIONS_ID"));
                arraylist.add(hashmap);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arraylist;
    }

    // public ArrayList pollAnswer() {
    // // 질문과 답항을 불러오자
    // // 1. 먼저 답을 불러오자_hashmap을 arraylist로 넣는다.
    // // 참고 FactorysDao.java

    // ArrayList arraylist = new ArrayList();
    // Commons commons = new Commons();
    // Statement statement = commons.getStatement();
    // String query = "";

    // try {
    // query = "SELECT * FROM db_pollsservlet.choic";
    // ResultSet resultset = statement.executeQuery(query);
    // HashMap hashmap = new HashMap<>();
    // while (resultset.next()) {
    // hashmap = new HashMap();
    // hashmap.put("CHOICE", resultset.getString("CHOICE"));
    // hashmap.put("CHOICE_ID", resultset.getString("CHOICE_ID"));
    // arraylist.add(hashmap);
    // }

    // } catch (Exception e) {
    // // TODO: handle exception
    // }
    // return arraylist;
    // }

    // 회원DB연결 메소드(혜인)
    public ArrayList SelectMembers() {
        ArrayList membersList = new ArrayList<>();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT *\n" + //
                    "FROM db_pollsservlet.respondents;";
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);

            HashMap members = new HashMap<>();
            while (resultSet.next()) {
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

        }
        return membersList;
    }

}
