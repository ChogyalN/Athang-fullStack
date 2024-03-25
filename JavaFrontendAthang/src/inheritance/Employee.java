package inheritance;

public class Employee extends User {
    protected String department;
    protected String workingBranch;
    protected String extension;
    protected String employeeType;

    protected String getPesonalInfo() {
        return super.getPesonalInfo() + " " + this.department + " " + this.employeeType + " " + this.extension + " " + this.workingBranch;
    }

}
