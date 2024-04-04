package com.techaxis.test.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import com.techaxis.java.test.Member;
import com.techaxis.java.test.MemberImporter;

public class MemberImporterImpl implements MemberImporter {

    @Override
    public List<Member> importMembers(File inputFile) throws Exception {

        /*
         * Implement the missing logic
         */
        List<Member> memberList = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line = "";
            while ((line =br.readLine()) != null) {
                Member member = new Member();
                member.setId(line.substring(0,12).strip());
                member.setLastName(line.substring(12,12+25).strip());
                member.setFirstName(line.substring(12+25,12+25+25).strip());
                member.setAddress(line.substring(12+25+25,12+25+25+30).strip());
                member.setCity(line.substring(12+25+25+30,12+25+25+30+20).strip());
                member.setState(line.substring(12+25+25+30+20,12+25+25+30+20+4).strip());
                member.setZip(line.substring(12+25+25+30+20+4,12+25+25+30+20+4+5).strip());
                System.out.println(member.toCSVString());
                memberList.add(member);
            }
        }

        return memberList;
    }
}
