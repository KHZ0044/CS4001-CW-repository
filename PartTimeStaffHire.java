public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    // Constructor
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, String staffName,
                             String joiningDate, String qualification, String appointedBy, boolean joined,
                             int workingHour, double wagesPerHour, String shifts) {
        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.terminated = false; // initially false
    }

    // Getters
    public int getWorkingHour() {
        return workingHour;
    }

    public double getWagesPerHour() {
        return wagesPerHour;
    }

    public String getShifts() {
        return shifts;
    }

    public boolean isTerminated() {
        return terminated;
    }

    // Setters
    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public void setWagesPerHour(double wagesPerHour) {
        this.wagesPerHour = wagesPerHour;
    }

    public void setShifts(String shifts) {
        if (isJoined()) {
            this.shifts = shifts;
        } else {
            System.out.println("Cannot change shift — staff has not joined.");
        }
    }

    // Terminate Staff
    public void terminateStaff() {
        if (terminated) {
            System.out.println("Staff is already terminated.");
        } else {
            setStaffName("");
            setJoiningDate("");
            setQualification("");
            setAppointedBy("");
            setJoined(false);
            terminated = true;
            System.out.println("Staff has been terminated.");
        }
    }

    // Display Method
    public void display() {
        super.display(); // display common fields
        System.out.println("Working Hour: " + workingHour);
        System.out.println("Wages Per Hour: " + wagesPerHour);
        System.out.println("Shifts: " + shifts);
        System.out.println("Terminated: " + terminated);
        System.out.println("Income Per Day: " + (wagesPerHour * workingHour));
    }
}
