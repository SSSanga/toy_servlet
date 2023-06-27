package com.example.toy_servlet.Daos;

import java.sql.Statement;
import java.util.ArrayList;

import com.example.toy_servlet.Commons.Commons;

// 각자 필요한 DB의 Method? 구문 쓰기. 
// 참고_with Teacher OptioninforsDao.java, FactorysDao.java

public class PollsDao {

    // 회원DB연결 메소드(혜인)
    public ArrayList SelectMembers() {
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
        } catch (Exception e) {
           
        }
        return arrayList;
    }

    // 설문 sevlet(상아)
    public int pollQuestion(){
        //질문과 답항을 불러오자
        // 1. 답을 불러오자_hashmap을 arraylist로 넣는다. 
        ArrayList arraylist = new ArrayList();
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        String query = "";

        try {
            
        } catch (Exception e) {
             System.out.println();
        }
        return 0;
    }

   
}
