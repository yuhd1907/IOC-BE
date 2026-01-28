package demo.emp;

import demo.Person;

public class Employee extends Person {
    private String empId;
    private String department;
    private String company;
    private String position;
    private int salary;

    public Employee() {
        super();
    }

    public Employee(String empId, String department, String company, String position, int salary) {
        this.empId = empId;
        this.department = department;
        this.company = company;
        this.position = position;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
