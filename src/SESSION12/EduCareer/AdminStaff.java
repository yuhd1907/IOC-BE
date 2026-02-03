package SESSION12.EduCareer;

import java.util.Scanner;

public class AdminStaff extends Staff implements ICapability {
    private double bonus;

    public AdminStaff(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "Thưởng: " + bonus;
    }

    @Override
    public double calculateTotalSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void checkPerformance() {
        System.out.println("Đánh giá hiệu suất làm việc của nhân viên");
    }
}
