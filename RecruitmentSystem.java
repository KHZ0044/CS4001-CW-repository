import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RecruitmentSystem extends JFrame implements ActionListener {
    // Input fields
    private JTextField vacancyField, designationField, jobTypeField, staffNameField, joiningDateField,
            qualificationField, appointedByField, salaryField, hoursField,
            workingHoursField, wagesPerHourField, shiftsField,
            vacancyForSalaryField, newSalaryField,
            vacancyForShiftsField, newShiftsField,
            terminateVacancyField;

    // Buttons
    private JButton addFullTimeButton, displayButton, addPartTimeButton,
            setSalaryButton, setShiftsButton, terminateButton, clearButton;

    private ArrayList<StaffHire> staffList;

    public RecruitmentSystem() {
        setTitle("Recruitment System");
        setSize(600, 850);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        staffList = new ArrayList<>();

        // Labels & Inputs
        JLabel vacancyLabel = new JLabel("Vacancy Number:");
        vacancyLabel.setBounds(20, 20, 150, 25);
        add(vacancyLabel);

        vacancyField = new JTextField();
        vacancyField.setBounds(180, 20, 200, 25);
        add(vacancyField);

        JLabel designationLabel = new JLabel("Designation:");
        designationLabel.setBounds(20, 60, 150, 25);
        add(designationLabel);

        designationField = new JTextField();
        designationField.setBounds(180, 60, 200, 25);
        add(designationField);

        JLabel jobTypeLabel = new JLabel("Job Type:");
        jobTypeLabel.setBounds(20, 100, 150, 25);
        add(jobTypeLabel);

        jobTypeField = new JTextField();
        jobTypeField.setBounds(180, 100, 200, 25);
        add(jobTypeField);

        JLabel staffNameLabel = new JLabel("Staff Name:");
        staffNameLabel.setBounds(20, 140, 150, 25);
        add(staffNameLabel);

        staffNameField = new JTextField();
        staffNameField.setBounds(180, 140, 200, 25);
        add(staffNameField);

        JLabel joiningDateLabel = new JLabel("Joining Date:");
        joiningDateLabel.setBounds(20, 180, 150, 25);
        add(joiningDateLabel);

        joiningDateField = new JTextField();
        joiningDateField.setBounds(180, 180, 200, 25);
        add(joiningDateField);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setBounds(20, 220, 150, 25);
        add(qualificationLabel);

        qualificationField = new JTextField();
        qualificationField.setBounds(180, 220, 200, 25);
        add(qualificationField);

        JLabel appointedByLabel = new JLabel("Appointed By:");
        appointedByLabel.setBounds(20, 260, 150, 25);
        add(appointedByLabel);

        appointedByField = new JTextField();
        appointedByField.setBounds(180, 260, 200, 25);
        add(appointedByField);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(20, 300, 150, 25);
        add(salaryLabel);

        salaryField = new JTextField();
        salaryField.setBounds(180, 300, 200, 25);
        add(salaryField);

        JLabel hoursLabel = new JLabel("Weekly Hours:");
        hoursLabel.setBounds(20, 340, 150, 25);
        add(hoursLabel);

        hoursField = new JTextField();
        hoursField.setBounds(180, 340, 200, 25);
        add(hoursField);

        JLabel workingHoursLabel = new JLabel("Working Hours:");
        workingHoursLabel.setBounds(20, 380, 150, 25);
        add(workingHoursLabel);

        workingHoursField = new JTextField();
        workingHoursField.setBounds(180, 380, 200, 25);
        add(workingHoursField);

        JLabel wagesPerHourLabel = new JLabel("Wages Per Hour:");
        wagesPerHourLabel.setBounds(20, 420, 150, 25);
        add(wagesPerHourLabel);

        wagesPerHourField = new JTextField();
        wagesPerHourField.setBounds(180, 420, 200, 25);
        add(wagesPerHourField);

        JLabel shiftsLabel = new JLabel("Shifts:");
        shiftsLabel.setBounds(20, 460, 150, 25);
        add(shiftsLabel);

        shiftsField = new JTextField();
        shiftsField.setBounds(180, 460, 200, 25);
        add(shiftsField);

        // Buttons
        addFullTimeButton = new JButton("Add Full-Time Staff");
        addFullTimeButton.setBounds(400, 20, 170, 30);
        addFullTimeButton.addActionListener(this);
        add(addFullTimeButton);

        addPartTimeButton = new JButton("Add Part-Time Staff");
        addPartTimeButton.setBounds(400, 60, 170, 30);
        addPartTimeButton.addActionListener(this);
        add(addPartTimeButton);

        displayButton = new JButton("Display Staff");
        displayButton.setBounds(400, 100, 170, 30);
        displayButton.addActionListener(this);
        add(displayButton);
        
        displayButton.addActionListener(this);
        add(displayButton);
        
                JLabel vacancySalaryLabel = new JLabel("Vacancy # (Set Salary):");
        vacancySalaryLabel.setBounds(20, 520, 170, 25);
        add(vacancySalaryLabel);

        vacancyForSalaryField = new JTextField();
        vacancyForSalaryField.setBounds(200, 520, 180, 25);
        add(vacancyForSalaryField);

        JLabel newSalaryLabel = new JLabel("New Salary:");
        newSalaryLabel.setBounds(20, 560, 170, 25);
        add(newSalaryLabel);

        newSalaryField = new JTextField();
        newSalaryField.setBounds(200, 560, 180, 25);
        add(newSalaryField);

        setSalaryButton = new JButton("Set Salary");
        setSalaryButton.setBounds(400, 140, 170, 30);
        setSalaryButton.addActionListener(this);
        add(setSalaryButton);

        JLabel vacancyShiftLabel = new JLabel("Vacancy # (Set Shift):");
        vacancyShiftLabel.setBounds(20, 600, 170, 25);
        add(vacancyShiftLabel);

        vacancyForShiftsField = new JTextField();
        vacancyForShiftsField.setBounds(200, 600, 180, 25);
        add(vacancyForShiftsField);

        JLabel newShiftsLabel = new JLabel("New Shifts:");
        newShiftsLabel.setBounds(20, 640, 170, 25);
        add(newShiftsLabel);

        newShiftsField = new JTextField();
        newShiftsField.setBounds(200, 640, 180, 25);
        add(newShiftsField);

        setShiftsButton = new JButton("Set Shifts");
        setShiftsButton.setBounds(400, 180, 170, 30);
        setShiftsButton.addActionListener(this);
        add(setShiftsButton);

        JLabel terminateVacancyLabel = new JLabel("Vacancy # to Terminate:");
        terminateVacancyLabel.setBounds(20, 680, 170, 25);
        add(terminateVacancyLabel);

        terminateVacancyField = new JTextField();
        terminateVacancyField.setBounds(200, 680, 180, 25);
        add(terminateVacancyField);

        terminateButton = new JButton("Terminate Staff");
        terminateButton.setBounds(400, 220, 170, 30);
        terminateButton.addActionListener(this);
        add(terminateButton);

        clearButton = new JButton("Clear Fields");
        clearButton.setBounds(400, 260, 170, 30);
        clearButton.addActionListener(this);
        add(clearButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == addFullTimeButton) {
                int vacancyNumber = Integer.parseInt(vacancyField.getText());
                String designation = designationField.getText();
                String jobType = jobTypeField.getText();
                String staffName = staffNameField.getText();
                String joiningDate = joiningDateField.getText();
                String qualification = qualificationField.getText();
                String appointedBy = appointedByField.getText();
                double salary = Double.parseDouble(salaryField.getText());
                int hours = Integer.parseInt(hoursField.getText());

                FullTimeStaffHire staff = new FullTimeStaffHire(vacancyNumber, designation, jobType, staffName,
                        joiningDate, qualification, appointedBy, true, salary, hours);
                staffList.add(staff);
                JOptionPane.showMessageDialog(this, "Full-Time Staff Added!");
            }

            if (e.getSource() == addPartTimeButton) {
                int vacancyNumber = Integer.parseInt(vacancyField.getText());
                String designation = designationField.getText();
                String jobType = jobTypeField.getText();
                String staffName = staffNameField.getText();
                String joiningDate = joiningDateField.getText();
                String qualification = qualificationField.getText();
                String appointedBy = appointedByField.getText();
                int workingHours = Integer.parseInt(workingHoursField.getText());
                double wagesPerHour = Double.parseDouble(wagesPerHourField.getText());
                String shifts = shiftsField.getText();

                PartTimeStaffHire staff = new PartTimeStaffHire(vacancyNumber, designation, jobType, staffName,
                        joiningDate, qualification, appointedBy, true, workingHours, wagesPerHour, shifts);
                staffList.add(staff);
                JOptionPane.showMessageDialog(this, "Part-Time Staff Added!");
            }

            if (e.getSource() == displayButton) {
                for (StaffHire s : staffList) {
                    s.display();
                }
            }

            if (e.getSource() == setSalaryButton) {
                int vacancy = Integer.parseInt(vacancyForSalaryField.getText());
                double newSalary = Double.parseDouble(newSalaryField.getText());
                boolean found = false;
                for (StaffHire s : staffList) {
                    if (s instanceof FullTimeStaffHire && s.getVacancyNumber() == vacancy) {
                        ((FullTimeStaffHire) s).setSalary(newSalary);
                        JOptionPane.showMessageDialog(this, "Salary Updated.");
                        found = true;
                        break;
                    }
                }
                if (!found)
                    JOptionPane.showMessageDialog(this, "Full-Time Staff not found.");
            }

            if (e.getSource() == setShiftsButton) {
                int vacancy = Integer.parseInt(vacancyForShiftsField.getText());
                String newShift = newShiftsField.getText();
                boolean found = false;
                for (StaffHire s : staffList) {
                    if (s instanceof PartTimeStaffHire && s.getVacancyNumber() == vacancy) {
                        ((PartTimeStaffHire) s).setShifts(newShift);
                        JOptionPane.showMessageDialog(this, "Shifts Updated.");
                        found = true;
                        break;
                    }
                }
                if (!found)
                    JOptionPane.showMessageDialog(this, "Part-Time Staff not found.");
            }

            if (e.getSource() == terminateButton) {
                int vacancy = Integer.parseInt(terminateVacancyField.getText());
                boolean found = false;
                for (StaffHire s : staffList) {
                    if (s instanceof PartTimeStaffHire && s.getVacancyNumber() == vacancy) {
                        ((PartTimeStaffHire) s).terminateStaff();
                        JOptionPane.showMessageDialog(this, "Part-Time Staff Terminated.");
                        found = true;
                        break;
                    }
                }
                if (!found)
                    JOptionPane.showMessageDialog(this, "Part-Time Staff not found.");
            }

            if (e.getSource() == clearButton) {
                vacancyField.setText("");
                designationField.setText("");
                jobTypeField.setText("");
                staffNameField.setText("");
                joiningDateField.setText("");
                qualificationField.setText("");
                appointedByField.setText("");
                salaryField.setText("");
                hoursField.setText("");
                workingHoursField.setText("");
                wagesPerHourField.setText("");
                shiftsField.setText("");
                vacancyForSalaryField.setText("");
                newSalaryField.setText("");
                vacancyForShiftsField.setText("");
                newShiftsField.setText("");
                terminateVacancyField.setText("");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new RecruitmentSystem();
    }
}



        