package com.example.study_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.study_servlets.commons.Commons;

public class OptioninforsDao {
    public int UpdateWithCarInfos(String name) {
        int count = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "update option_infors\n" + //
                    "set OPTION_NAME = '" + name + "'\n" + //
                    "where OPTION_NAME = OPTION_INFOR_ID = 'OI001';\n" + //
                    "";
            count = statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return count;

    }

    public int InsertWithCarInfos(String name) {
        int count = 0;
        try {
            Commons commons = new Commons();
            String UUID = commons.getGeneratorID();
            Statement statement = commons.getStatement();
            String query = "insert into option_infors\n" + //
                    "(OPTION_INFOR_ID,OPTION_NAME)\n" + //
                    "value\n" + //
                    "('" + UUID + "','" + name + "');";
            count = statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public int UpdateWithName(String uniqueID, String changename) {
        int count = 0;
        try {
            Commons dbconnection = new Commons();
            Statement update = dbconnection.getStatement();
            uniqueID = "";
            changename = "";
            String query = "UPDATE option_infors\n" + //
                    "SET OPTION_NAME = '"+changename+"'\n" + //
                    "WHERE OPTION_INFOR_ID = '" + uniqueID + "';";
            count = update.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public int InsertWithName(String name) {
        int count = 0;
        try {
            Commons dbconnection = new Commons();
            Statement insertion = dbconnection.getStatement();
            String newuuid = dbconnection.getGeneratorID();

            String query = "INSERT INTO option_infors\n" + //
                    "(OPTION_INFOR_ID,OPTION_NAME)\n" + //
                    "VALUES ('" + newuuid + "','" + name + "');";
            count = insertion.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public int DeleteWithUniqeID(String unique_id) {
        int count = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "delete from option_infors\n" + //
                    "where OPTION_INFOR_ID = '" + unique_id + "' ;";
            count = statement.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

    public ArrayList SeletWhithSearch(String search) {

        ArrayList optionInforList = new ArrayList();
        try {
            if (search == null) { // search의 값이 null일때 공란으로 적용하는 if문
                search = "";
            }
            Commons commons = new Commons();
            Statement statement = commons.getStatement(); // Editor in Workbanch
            String query = "select *\n" + //
                    "from option_infors\n" +
                    "where OPTION_NAME like '" + search + "%';";
            ResultSet resultset = statement.executeQuery(query);

            HashMap optionInforRecord = new HashMap<>();
            while (resultset.next()) {
                optionInforRecord = new HashMap<>();
                optionInforRecord.put("OPTION_INFOR_ID", resultset.getString("OPTION_INFOR_ID"));
                optionInforRecord.put("OPTION_NAME", resultset.getString("OPTION_NAME"));

                optionInforList.add(optionInforRecord);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return optionInforList;
    }

}