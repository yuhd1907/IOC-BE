package SESSION06;

import java.util.Arrays;
import java.util.Scanner;

public class quan_ly_bien_so_xe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bienSo = new String[100]; // mảng lưu biển số
        int n = 0; // số lượng biển số hiện có

        int choice;
        do {
            System.out.println("************* QUẢN LÝ BIỂN SỐ XE *************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng biển số cần thêm: ");
                    int k = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < k; i++) {
                        System.out.print("Nhập biển số xe: ");
                        String bs = sc.nextLine();

                        // kiểm tra định dạng 30F-123.45
                        if (bs.matches("^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$")) {
                            bienSo[n++] = bs;
                        } else {
                            System.out.println("Biển số không đúng định dạng!");
                            i--;
                        }
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }
                    System.out.println("Danh sách biển số xe:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(bienSo[i]);
                    }
                    break;

                case 3:
                    System.out.print("Nhập biển số cần tìm: ");
                    String tim = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (bienSo[i].equalsIgnoreCase(tim)) {
                            System.out.println("Tìm thấy: " + bienSo[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy biển số!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã tỉnh (VD: 29, 30, 51, 16): ");
                    String maTinh = sc.nextLine();
                    boolean co = false;

                    for (int i = 0; i < n; i++) {
                        if (bienSo[i].startsWith(maTinh)) {
                            System.out.println(bienSo[i]);
                            co = true;
                        }
                    }
                    if (!co) {
                        System.out.println("Không có biển số thuộc tỉnh này!");
                    }
                    break;

                case 5:
                    if (n == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }
                    Arrays.sort(bienSo, 0, n);
                    System.out.println("Đã sắp xếp biển số xe tăng dần.");
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }
}
