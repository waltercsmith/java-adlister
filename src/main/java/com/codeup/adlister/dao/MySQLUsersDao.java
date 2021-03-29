package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection = null;
    public MySQLUsersDao(Config config) {
//        private Connection connection = null;


        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }

    }

    @Override
    public Long insert(User user) {
//        private Connection connection = null; //<--- this might be a problem later so remember you added this
        try {

            PreparedStatement stmt = connection.prepareStatement("INSERT INTO users(username, email, password) VALUES(?,?,?) ", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        String query = "select * from users where username = ? limit 1";
        try {

            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, username);


            ResultSet rs = stmt.executeQuery();

            rs.next();



            return new User(
                    rs.getLong(1),
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("password")

            );


        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }
}
