package com.techaxis.java.test;

import com.techaxis.test.impl.MemberExporterImpl;
import com.techaxis.test.impl.MemberImporterImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileConverterMain extends MemberFileConverter{
    @Override
    protected MemberExporter getMemberExporter() {
        return new MemberExporterImpl();
    }

    @Override
    protected MemberImporter getMemberImporter() {
        return new MemberImporterImpl();
    }

    @Override
    protected List<Member> getNonDuplicateMembers(List<Member> membersFromFile) {
        List<Member> nonDulicateMembers = new ArrayList<>();
        for(Member member: membersFromFile){
            if(!isDuplicate(member, nonDulicateMembers)){
                nonDulicateMembers.add(member);
            }
        }
        return nonDulicateMembers;
    }

    private boolean isDuplicate(Member member, List<Member> nonDulicateMembers) {
        for(Member newMember: nonDulicateMembers){
            if(member.getId().equals(newMember.getId()) &&
                    member.getFirstName().equals(newMember.getFirstName())&&
                    member.getLastName().equals(newMember.getLastName())&&
                    member.getAddress().equals(newMember.getAddress())&&
                    member.getCity().equals(newMember.getCity())&&
                    member.getState().equals(newMember.getState())&&
                    member.getZip().equals(newMember.getZip())){
                System.out.println("Duplicate Member: " + member.toCSVString());
                return true;
            }
        }
        return false;
    }

    @Override
    protected Map<String, List<Member>> splitMembersByState(List<Member> validMembers) {
        Map<String, List<Member>> membersByState = new HashMap<>();
        for(Member member: validMembers){
            if(membersByState.size()>1) {
                List<Member> getAddedList = membersByState.get(member.getState());
                if(getAddedList!=null){
                    getAddedList.add(member);
                    membersByState.put(member.getState(),getAddedList);
                }else{
                    List<Member> memberListByState = new ArrayList<>();
                    memberListByState.add(member);
                    membersByState.put(member.getState(),memberListByState);
                }
            }else{
                List<Member> memberListByState = new ArrayList<>();
                memberListByState.add(member);
                membersByState.put(member.getState(),memberListByState);
            }
        }
        return membersByState;
    }

    public static void main(String[] args) {
        MemberFileConverter converter = new FileConverterMain();
        try {
            converter.convert(new File("Members.txt"), "D:\\Athang java\\JavaFrontendAthang\\src\\assignment1\\file\\","outputfile.csv");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
