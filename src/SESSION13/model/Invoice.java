package SESSION13.model;

import java.util.Scanner;

public class Invoice implements IBaseModel{
    private String id;
    private double amount;

    public Invoice() {
    }

    public Invoice(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã hóa đơn: ");
        id = scanner.nextLine();

        while (true) {
            System.out.print("Nhập số tiền: ");
            amount = Double.parseDouble(scanner.nextLine());
            if (amount >= 0) {
                break;
            } else {
                System.err.println("Vui lòng nhập số thực >= 0 !");
            }
        }
    }

    @Override
    public void displayData() {
        System.out.printf("| %-10s | %-15.2f |\n", id, amount);
        System.out.println("+------------+-----------------+");
    }
}
