package inheritance;

public class Customer extends User {
    protected String accNo;
    protected String availableBal;
    protected String accountBranch;

    protected String getPesonalInfo() {
        return super.getPesonalInfo() + " " + this.accNo + " " + this.availableBal + " " + this.accountBranch;
    }

}
