package com.codeup.adlister.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;


import java.sql.SQLException;
import java.util.List;

public class MySQLAdsDao implements Ads {

    public MySQLAdsDao(Config config){

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
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

        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}



