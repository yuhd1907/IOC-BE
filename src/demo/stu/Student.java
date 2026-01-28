package demo.stu;

import demo.Person;

import java.util.Scanner;

public class Student extends Person {
    private String stuId;
    private String className;
    private String schoolName;

    public Student() {
        super();
    }

    public Student(String stuId, String className, String schoolName) {
        this.stuId = stuId;
        this.className = className;
        this.schoolName = schoolName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        stuId = sc.nextLine();
        super.input();
        System.out.print("Nhập tên lớp: ");
        className = sc.nextLine();
        System.out.print("Nhập tên trường: ");
        schoolName = sc.nextLine();
    }

    @Override
    public void printInfo() {
        System.out.println("MSV: " + stuId);
        super.printInfo();
        System.out.println("Lớp: " + className);
        System.out.println("Trường: " + schoolName);
    }
}
