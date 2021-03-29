package com.codeup.adlister.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;


import java.sql.SQLException;
import java.sql.Statement;
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
            statement.executeQuery("select * from ads");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }



    @Override
    public Long insert(Ad ad) {
        return null;
    }
}



