package assignment1;

import collectionsFramework.ListSetDemo;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MemberMain extends MemberFileConverter {
    Member member;

    public static void main(String[] args) throws Exception {
        MemberMain mainApp = new MemberMain();
        File file = new File("D:\\Athang java\\JavaFrontendAthang\\src\\assignment1\\file\\Members.txt");
        System.out.println(file.exists());

        String outputFilePath = "D:\\Athang java\\JavaFrontendAthang\\src\\assignment1\\file\\";
        String outputFileName = "outputFile.csv";

        MemberFileConverter fileConverter = new MemberMain();
        fileConverter.convert(file, outputFilePath, outputFileName);
    }

    @Override
    protected MemberExporter getMemberExporter() {
        MemberExporter memberExporter = new MemberExporterImpl();
        return memberExporter;
    }

    @Override
    protected MemberImporter getMemberImporter() {
        MemberImporter memberImporter = new MemberImpoterImpl();
        return memberImporter;
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

    private boolean isDuplicate(Member m, List<Member> newList) {
        for(Member newMember: newList){
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
}
