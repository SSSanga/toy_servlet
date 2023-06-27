package com.example.toy_servlet.Daos;

import java.sql.Statement;
import java.util.ArrayList;

import com.example.toy_servlet.Commons.Commons;

// 각자 필요한 DB의 Method? 구문 쓰기. 
// 참고_with Teacher OptioninforsDao.java, FactorysDao.java

public class PollsDao {
    //db 연결 및 statement(=editor), String query까지 포함. 
    Commons commons = new Commons();

    // 로그인/로그아웃 servlet(명곤)
    public int () {
        try {
            
        } catch (Exception e) {
            System.out.println();
        }
    }

    
    // 회원관리 servlet(혜인)
    public ArrayList SelectMembers() {
        try {
            
        } catch (Exception e) {
           
        }
        return 0;
    }

    // 설문 sevlet(상아)
    public int pollQuestion(){
        //질문과 답항을 불러오자
        // 1. 답을 불러오자_hashmap을 arraylist로 넣는다. 
        ArrayList arraylist = new ArrayList();
        Statement statement = commons.getStatement();
        String query = "";

        try {
            
        } catch (Exception e) {
             System.out.println();
        }
        return 0;
    }

   
}
