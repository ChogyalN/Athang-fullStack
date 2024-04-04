package com.jdbcAthang01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
//        Main.creatTable();
//        Main.insertData();
//        Main.deleteMember(1);
        Main.updateMember(3,"230830", "Sonam", "Thimphu","BT");
    }

//    private static Connection conn(){
//        String url = "jdbc:mysql://localhost:3306/yangkhor";
//        String userName = "root";
//        String password = "root";
//        Connection connection;
//        try{
//            connection = DriverManager.getConnection(url, userName, password);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return connection;
//    }

    private static void creatTable(){
        String url = "jdbc:mysql://localhost:3306/athang";
        String userName = "root";
        String password = "root";
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Member "
                + "(ID INT PRIMARY KEY AUTO_INCREMENT,"
                + " SEC_ID VARCHAR(50), "
                + " LASTNAME VARCHAR(50), "
                + " FIRSTNAME VARCHAR(50), "
                + " ADDRESS TEXT,"
                + " CITY VARCHAR(50), "
                + " STATE VARCHAR(2), "
                + " ZIP VARCHAR(10))";
        System.out.println(createTableSQL);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            // Do Operations
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void insertData(){
        String url = "jdbc:mysql://localhost:3306/athang";
        String user = "root";
        String password = "root";

        //Query Parameters
        String secId = "'10132343485'";
        String lastName = "'Chogyal'";
        String firstName = "'PRANGE'";
        String address = "'4829 JAUREGUI BLVD'";
        String city = "'CORCORAN'";
        String state = "'IL'";
        String zip = "'55357'";
        String INSERT_MEMBER_SQL = "INSERT INTO member(" +
                "sec_id, lastname, firstname, address, city, state, zip)" +
                "VALUES (" + secId + "," + lastName + "," + firstName +
                "," + address + "," + city + "," + state + "," + zip + ");";

        System.out.println(INSERT_MEMBER_SQL);

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(INSERT_MEMBER_SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteMember(int id){
        String url = "jdbc:mysql://localhost:3306/athang";
        String user = "root";
        String password = "root";

        String DELETE_MEMEBER = "delete from member where id = "+ id +"";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            if(statement.executeUpdate(DELETE_MEMEBER) != 0){
                System.out.println("The user with id "+id+" is deleted!");
            };
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void updateMember(int id, String sec_id, String lastName,
                                     String address, String state){
        String url = "jdbc:mysql://localhost:3306/athang";
        String user = "root";
        String password = "root";

//        String UPDATE_MEMBER = "update member set SEC_ID ="
//                +sec_id+",FIRSTNAME = "+firstName+", LASTNAME = "+lastName+",ADDRESS = "
//                +address+",STATE = "+state+" where id ="+id+"";

        String UPDATE_MEMBER = "update member set SEC_ID ='"
                +sec_id+"', LASTNAME = '"+lastName+"',ADDRESS = '"
                +address+"',STATE = '"+state+"' where id ='"+id+"'";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            if(statement.executeUpdate(UPDATE_MEMBER) != 0){
                System.out.println("The updation is successfull");
            };
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}