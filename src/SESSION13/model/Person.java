package SESSION13.model;

import java.util.Scanner;

public class Person implements IBaseModel {
    private String name;
    private String email;
    private String phone;

    public Person() {
    }

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void inputData(Scanner scanner) {
        while (true) {
            System.out.print("Nhập tên người dùng: ");
            name = scanner.nextLine();
            if (!name.trim().isEmpty()) {
                break;
            }
            System.err.println("Vui lòng ko để trống !");
        }

        while (true) {
            System.out.print("Nhập email người dùng: ");
            email = scanner.nextLine();
            if (!email.trim().isEmpty()) {
                break;
            }
            System.err.println("Vui lòng ko để trống !");
        }

        while (true) {
            System.out.print("Nhập số điện thoại người dùng: ");
            phone = scanner.nextLine();
            if (!phone.trim().isEmpty()) {
                break;
            }
            System.err.println("Vui lòng ko để trống !");
        }
    }

    @Override
    public void displayData() {
        System.out.printf("| %-25s | %-25s | %-15s |\n", name, email, phone);
        System.out.println("+---------------------------+---------------------------+-----------------+");
    }
}
