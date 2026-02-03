package SESSION12.TeachAsset;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Asset[] assets = new Asset[100];
    static int size = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập tài sản");
            System.out.println("2. Xuất báo cáo");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Sửa giá mua");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addAsset();
                    break;
                case 2:
                    showReport();
                    break;
                case 3:
                    searchMenu();
                    break;
                case 4:
                    updatePrice();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);
    }

    // 1. Nhập tài sản
    static void addAsset() {
        System.out.println("1. Máy tính");
        System.out.println("2. Thiết bị mạng");
        System.out.print("Chọn loại: ");
        int type = Integer.parseInt(sc.nextLine());

        System.out.print("Asset Code: ");
        String code = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Purchase Price: ");
        double price = Double.parseDouble(sc.nextLine());

        if (type == 1) {
            System.out.print("RAM (GB): ");
            int ram = Integer.parseInt(sc.nextLine());
            System.out.print("CPU: ");
            String cpu = sc.nextLine();
            assets[size++] = new Computer(code, name, price, ram, cpu);
        } else if (type == 2) {
            System.out.print("Number of Ports: ");
            int ports = Integer.parseInt(sc.nextLine());
            assets[size++] = new NetworkDevice(code, name, price, ports);
        }
    }

    // 2. Xuất báo cáo
    static void showReport() {
        if (size == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }

        for (int i = 0; i < size; i++) {
            AssetUtil.showValue(assets[i]); // đa hình
            System.out.println("------------------");
        }
    }

    // 3. Menu tìm kiếm
    static void searchMenu() {
        System.out.println("1. Tìm theo mã");
        System.out.println("2. Tìm theo giá mua > X");
        System.out.print("Chọn: ");
        int choice = Integer.parseInt(sc.nextLine());

        if (choice == 1) {
            System.out.print("Nhập mã: ");
            search(sc.nextLine());
        } else if (choice == 2) {
            System.out.print("Nhập giá: ");
            search(Double.parseDouble(sc.nextLine()));
        }
    }

    // Overloading: tìm theo mã
    static void search(String assetCode) {
        for (int i = 0; i < size; i++) {
            if (assets[i].getAssetCode().equalsIgnoreCase(assetCode)) {
                AssetUtil.showValue(assets[i]);
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    // Overloading: tìm theo giá
    static void search(double price) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (assets[i].getPurchasePrice() > price) {
                AssetUtil.showValue(assets[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có tài sản phù hợp");
        }
    }

    // 4. Sửa giá mua
    static void updatePrice() {
        System.out.print("Nhập mã cần sửa: ");
        String code = sc.nextLine();

        for (int i = 0; i < size; i++) {
            if (assets[i].getAssetCode().equalsIgnoreCase(code)) {
                System.out.print("Giá mới: ");
                assets[i].setPurchasePrice(Double.parseDouble(sc.nextLine()));
                System.out.println("Cập nhật thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy tài sản");
    }
}
