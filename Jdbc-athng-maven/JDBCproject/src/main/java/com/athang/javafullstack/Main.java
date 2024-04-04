package com.athang.javafullstack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        new Main().connection();
    }

    private static Connection connection(){
        String url = "jdbc:mysql://localhost:3306/yangkhor";
        String userName = "root";
        String password = "root";
        Connection conn;
        try{
            conn = DriverManager.getConnection(url, userName, password);
            if(conn != null){
                return conn;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}