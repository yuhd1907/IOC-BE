package SESSION13.model;

import java.util.Scanner;

public class AttendanceStudent implements IBaseModel {
    private String id;
    private String name;

    public AttendanceStudent() {
    }

    public AttendanceStudent(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập id sinh viên: ");
        id = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
    }

    @Override
    public void displayData() {
        System.out.printf("| %-10s | %-25s |\n", id, name);
        System.out.println("+------------+---------------------------+");
    }
}
