public class FullTimeStaffHire extends StaffHire {
    private double salary;
    private int weeklyFractionalHours;

    // Constructor
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, String staffName,
                             String joiningDate, String qualification, String appointedBy, boolean joined,
                             double salary, int weeklyFractionalHours) {
        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;
    }

    // Getters
    public double getSalary() {
        return salary;
    }

    public int getWeeklyFractionalHours() {
        return weeklyFractionalHours;
    }

    // Setters
    public void setSalary(double salary) {
        if (isJoined()) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be set — staff not yet joined.");
        }
    }

    public void setWeeklyFractionalHours(int weeklyFractionalHours) {
        this.weeklyFractionalHours = weeklyFractionalHours;
    }

    // Display
    public void display() {
        super.display(); // call the display method of StaffHire
        System.out.println("Salary: " + salary);
        System.out.println("Weekly Fractional Hours: " + weeklyFractionalHours);
    }
}
