package assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MemberImpoterImpl implements MemberImporter {
    Member member;

    @Override
    public List<Member> importMembers(File inputFile) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        List<Member> fetchedMember = new ArrayList<>();
        String line;
        String[] txtToStrArry;
        while ((line = br.readLine()) != null) {

            strArrToObj(line);
            fetchedMember.add(member);
        }
        return fetchedMember;
    }

    private Member strArrToObj(String input) {
        member = new Member();

        member.setId(input.substring(0, 12).trim());
        member.setFirstName(input.substring(12, 37).trim());
        member.setLastName(input.substring(37, 62).trim());
        member.setAddress(input.substring(62, 92).trim());
        member.setCity(input.substring(92, 112).trim());
        member.setCity(input.substring(112, 116).trim());
        member.setZip(input.substring(116).trim());

        return member;
    }
}
