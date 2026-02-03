package SESSION12.CoffeeShopPro;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Drink[] menu = new Drink[100];
    static int size = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU QUÁN CÀ PHÊ =====");
            System.out.println("1. Thêm món");
            System.out.println("2. Hiển thị menu");
            System.out.println("3. Áp dụng mã giảm giá");
            System.out.println("4. Xóa món");
            System.out.println("5. Thống kê giá trung bình");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addDrink();
                    break;
                case 2:
                    showMenu();
                    break;
                case 3:
                    applyDiscount();
                    break;
                case 4:
                    removeDrink();
                    break;
                case 5:
                    averagePrice();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 6);
    }

    // 1. Thêm món
    static void addDrink() {
        System.out.println("1. Cà phê");
        System.out.println("2. Trà trái cây");
        System.out.print("Chọn loại: ");
        int type = Integer.parseInt(sc.nextLine());

        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Tên món: ");
        String name = sc.nextLine();
        System.out.print("Giá: ");
        double price = Double.parseDouble(sc.nextLine());

        if (type == 1) {
            menu[size++] = new Coffee(id, name, price);
        } else if (type == 2) {
            menu[size++] = new FruitTea(id, name, price);
        }
    }

    // 2. Hiển thị menu
    static void showMenu() {
        if (size == 0) {
            System.out.println("Menu trống");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(menu[i]);
            System.out.print("Cách pha chế: ");
            menu[i].prepare(); // đa hình
            System.out.println("------------------");
        }
    }

    // 3. Áp dụng giảm giá
    static void applyDiscount() {
        System.out.print("Nhập % giảm giá: ");
        double percent = Double.parseDouble(sc.nextLine());

        for (int i = 0; i < size; i++) {
            menu[i].applyDiscount(percent); // interface
        }
        System.out.println("Đã áp dụng giảm giá cho toàn bộ menu");
    }

    // 4. Xóa món
    static void removeDrink() {
        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine();

        for (int i = 0; i < size; i++) {
            if (menu[i].getId().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    menu[j] = menu[j + 1];
                }
                size--;
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy món");
    }

    // 5. Thống kê giá trung bình
    static void averagePrice() {
        if (size == 0) {
            System.out.println("Menu trống");
            return;
        }

        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += menu[i].getPrice();
        }

        System.out.println("Giá trung bình: " + (sum / size));
    }
}
