package SESSION12.EduCareer;

import java.util.Scanner;

public abstract class Staff implements ICapability{
    private String id;
    private String name;
    private double baseSalary;

    public Staff() {
    }

    public Staff(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Id: " + id + '\n' +
                "Tên: " + name + '\n' +
                "Lương cơ bản: " + baseSalary + '\n';
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateTotalSalary();
}
