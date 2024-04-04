package com.jdbcAthang01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdcbFileReadMain {
    public static void main(String[] args) throws Exception {
        JdcbFileReadMain insert = new JdcbFileReadMain();
        insert.insertMemberInDb();
    }

    private void insertMemberInDb() throws Exception, SQLException {
        String url = "jdbc:mysql://localhost:3306/athang";
        String userName = "root";
        String password = "root";
        String file = "D:\\Athang java\\JavaFrontendAthang\\src\\assignment1\\file\\Members.txt";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            for (Member m : importMembers(file)) {
                String INSERT_MEMBER_SQL = "INSERT INTO member(" +
                        "sec_id, lastname, firstname, address, city, state, zip)" +
                        "VALUES ('" + m.getSec_id() + "','" + m.getLastName() + "','" + m.getFirstName() +
                        "','" + m.getAddress() + "','" + m.getCity() + "','" + m.getSec_id() + "','" + m.getZip() + "');";
                Statement statement = conn.createStatement();
                statement.executeUpdate(INSERT_MEMBER_SQL);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Member> importMembers(String inputFile) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        Member member = new Member();

        List<Member> fetchedMember = new ArrayList<>();
        String line;
        String[] txtToStrArry;
        while ((line = br.readLine()) != null) {

            fetchedMember.add(strArrToObj(line));
        }
        for(Member m : fetchedMember){
            System.out.println(m+ "  ");
        }
        return fetchedMember;
    }

    private Member strArrToObj(String input) {
        Member member = new Member();

        member.setSec_id(input.substring(0, 12).trim());
        member.setFirstName(input.substring(12, 37).trim());
        member.setLastName(input.substring(37, 62).trim());
        member.setAddress(input.substring(62, 92).trim());
        member.setCity(input.substring(92, 112).trim());
        member.setState(input.substring(112, 116).trim());
        member.setZip(input.substring(116).trim());

        System.out.println(member);
        return member;
    }
}
