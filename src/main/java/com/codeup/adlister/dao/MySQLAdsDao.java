package com.codeup.adlister.dao;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;



    public MySQLAdsDao(Config config){

        try {
            DriverManager.registerDriver(new Driver());
             connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @Override
    public List<Ad> all() {

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from ads");

            return generateAds(rs);
//            while(rs.next()){
//                System.out.println("rs.getLong(\"id\") = " + rs.getLong("id"));
//                System.out.println("rs.getString(\"title\") = " + rs.getString("title"));
//            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }


    private List<Ad> generateAds(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()){

            ads.add(new Ad(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
            ));

        }


        return ads;
    }

//
//    @Override
//    public Long insert(Ad ad) {
//        return null;
//    }
}



