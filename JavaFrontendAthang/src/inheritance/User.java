package inheritance;

public class User {
    protected String name;
    protected String address;
    protected String phoneNo;
    protected String dob;
    protected String email;

    protected String getPesonalInfo() {
        return this.name + " : " + this.address + " : " + this.dob + " : " + this.email;
    }
}
