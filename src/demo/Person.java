package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String fullName;
    private Date birthday;
    private boolean sex;
    private String address;

    public Person() {
    }

    public Person(String fullName, Date birthday, boolean sex, String address) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        fullName = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            birthday = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Có lỗi: " + e.getMessage());
        }
        System.out.print("Nhập giới tính: ");
        sex = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập quê quán: ");
        address = sc.nextLine();
    }

    public void printInfo(){
        System.out.println("Họ tên: " + fullName);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngày sinh: " + sdf.format(birthday));
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Quê quán: " + address);
    }
}
