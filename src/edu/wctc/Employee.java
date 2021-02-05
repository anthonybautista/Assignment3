package edu.wctc;

import java.time.LocalDate;

public class Employee extends Asset implements Employable {
    private int employeeNumber;
    private LocalDate startDate;
    private double payRate;
    private String name;

    public Employee(int employeeNumber, String name, Double payRate, LocalDate startDate) {
        this.startDate = startDate;
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.payRate = payRate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "Employee name: " + name +
                "\nEmployee Start Date: " + startDate +
                "\nEmployee Pay Rate: " + payRate;
    }

    @Override
    public double calculateSalary(double hours) {
        return hours * payRate;
    }
}
