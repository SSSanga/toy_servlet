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

    // 상아 답안 불러오기
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

    // 상아 설문질문 불러오기
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
            System.out.println(e.getMessage());
        }
        return membersList;
    }

    // 회원 상세정보 메서드(헤인)
    public ArrayList InfoMembers(String name) {
        ArrayList membersList = new ArrayList<>();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT *\n" + //
                    "FROM respondents\n" + //
                    "WHERE RESPONDENTS LIKE '" + name + "';";
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);

            HashMap<String, String> members = new HashMap<>();
            while (resultSet.next()) {
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

    // 통계 메서드(혜인)
    public int replyCount() {
        int total = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT COUNT(*) AS TOTAL\n" + //
                    "FROM (SELECT COUNT(*)\n" + //
                    "\tFROM statistics\n" + //
                    "\tGROUP BY RESPONDENTS_ID) AS CNT;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("TOTAL"));
                total = resultSet.getInt("TOTAL");
            }

        } catch (Exception e) {

        }
        return total;
    }
}
