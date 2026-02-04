package SESSION13.model;

import java.util.Scanner;

public class Order implements IBaseModel {
    private String id;
    private String customerName;
    private String productName;
    private double price;

    public Order() {
    }

    public Order(String id, String customerName, String productName, double price) {
        this.id = id;
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập mã đơn hàng: ");
        id = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        customerName = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        productName = sc.nextLine();
        System.out.print("Nhập giá: ");
        price = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("| %-10s | %-25s | %-25s | %-12.2f |\n", id, customerName, productName, price);
        System.out.println("+------------+---------------------------+---------------------------+--------------+");
    }
}
