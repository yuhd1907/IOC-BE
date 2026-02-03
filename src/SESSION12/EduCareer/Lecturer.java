package SESSION12.EduCareer;

import java.util.Scanner;

public class Lecturer extends Staff implements ICapability {
    private double teachingHours;

    public Lecturer(String id, String name, double baseSalary, double teachingHours) {
        super(id, name, baseSalary);
        this.teachingHours = teachingHours;
    }

    @Override
    public String toString() {
        return super.toString() + "Số giờ dạy: " + teachingHours;
    }

    @Override
    public double calculateTotalSalary() {
        return getBaseSalary() + (teachingHours * 200.000);
    }

    @Override
    public void checkPerformance() {
        System.out.println("Đánh giá hiệu suất giảng dạy của giảng viên");
    }
}
