package collectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetDemo {
    public static void main(String[] args) {
        ListSetDemo ld = new ListSetDemo();
        ld.execute();
    }

    private void execute() {
        arrayListDemo();
        findDuplicate();
        //setDemo();
        //setDemoWithMembers();
        //listToSet();
    }

    private void setDemo() {
        Set<String> mySet = new HashSet<>();
        mySet.add("Tashi");
        mySet.add("Tshering");
        mySet.add("Tashi");
        mySet.add("Sonam");
        mySet.add("Tashi");

        for (String name : mySet) {
            System.out.println(name);
        }

    }

    public void setDemoWithMembers() {
        Set<Member> memberSet = new HashSet<>();
        memberSet.add(new Member("Sonam", 22, "sonam@gmail.com"));
        memberSet.add(new Member("Tshering", 23, "tshering@gmail.com"));
        memberSet.add(new Member("Tashi", 22, "tashi@gmail.com"));
        memberSet.add(new Member("Sonam", 22, "sonam@gmail.com"));
        memberSet.add(new Member("Sonam", 23, "sonam@gmail.com"));
        memberSet.add(new Member("Tashi", 22, "tashi@gmail.com"));

        for (Member memeber : memberSet) {
            System.out.println(memeber);
        }
    }

    public void listToSet() {
        List<String> myList = new ArrayList<>();
        myList.add("Tashi");
        myList.add("Tshering");
        myList.add("Tashi");
        myList.add("Sonam");
        myList.add("Tashi");

        for (String name : myList) {
            System.out.println(name);
        }
        System.out.println("***************************");
        Set<String> mySet = new HashSet<>(myList);
        for (String name : mySet) {
            System.out.println(name);
        }
    }

    public void findDuplicate() {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("Sonam", 22, "sonam@gmail.com"));
        memberList.add(new Member("Tshering", 23, "tshering@gmail.com"));
        memberList.add(new Member("Tashi", 22, "tashi@gmail.com"));
        memberList.add(new Member("Sonam", 22, "sonam@gmail.com"));
        memberList.add(new Member("Sonam", 23, "sonam@gmail.com"));
        memberList.add(new Member("Tashi", 22, "tashi@gmail.com"));

        List<Member> newList = new ArrayList<>();
        for(Member m : memberList){
            if(!isDuplicate(m, newList)){
                newList.add(m);
            }
        }
        for(Member m : newList){
            System.out.println(m);
        }
    }

    private boolean isDuplicate(Member m, List<Member> newList) {
        for(Member member : newList){
            if(member.age == m.age && member.email == m.email && member.name == m.name ){
                return true;
            }
        }
        return false;
    }

    private void arrayListDemo() {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("Member1", 20, "test@test.com"));
        memberList.add(new Member("Member2", 22, "test1@test.com"));
        memberList.add(new Member("Member3", 23, "test2@test.com"));
        memberList.add(new Member("Member4", 24, "test3@test.com"));
        memberList.add(new Member("Member5", 25, "test4@test.com"));

        for (Member member : memberList) {
            System.out.println(member);
        }

//        for(int i=0; i< memberList.size();i++){
//            if(i>0 && i<(memberList.size()-1)){
//                System.out.println(memberList.get(i));
//            }
//        }

//        List<Member> newList =memberList.subList(1,4);
//        for(Member m : newList){
//            System.out.println(m);
//        }

        for (Member m : memberList.subList(1, 4)) {
            System.out.println(m);
        }
    }

    class Member {
        private String name;
        private int age;
        private String email;

        public Member(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Member{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
}