package SESSION06;

import java.util.Scanner;
import java.util.regex.Pattern;

public class quan_ly_nguoi_dung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mảng lưu thông tin người dùng
        String[] user = new String[4]; // 0: họ tên, 1: email, 2: điện thoại, 3: mật khẩu

        int choice;
        do {
            System.out.println("************* QUẢN LÝ NGƯỜI DÙNG *************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ và tên: ");
                    user[0] = sc.nextLine();

                    System.out.print("Nhập email: ");
                    user[1] = sc.nextLine();

                    System.out.print("Nhập số điện thoại: ");
                    user[2] = sc.nextLine();

                    System.out.print("Nhập mật khẩu: ");
                    user[3] = sc.nextLine();
                    break;

                case 2:
                    if (user[0] == null) {
                        System.out.println("Chưa nhập họ tên!");
                        break;
                    }
                    user[0] = user[0].trim().toLowerCase();
                    String[] parts = user[0].split("\\s+");
                    String name = "";
                    for (String p : parts) {
                        name += p.substring(0, 1).toUpperCase() + p.substring(1) + " ";
                    }
                    user[0] = name.trim();
                    System.out.println("Họ tên sau chuẩn hóa: " + user[0]);
                    break;

                case 3:
                    if (user[1] == null) {
                        System.out.println("Chưa nhập email!");
                        break;
                    }
                    String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
                    System.out.println(
                            Pattern.matches(emailRegex, user[1])
                                    ? "Email hợp lệ"
                                    : "Email không hợp lệ"
                    );
                    break;

                case 4:
                    if (user[2] == null) {
                        System.out.println("Chưa nhập số điện thoại!");
                        break;
                    }
                    // Số di động Việt Nam: 03,05,07,08,09 + 8 số
                    String phoneRegex = "^(03|05|07|08|09)\\d{8}$";
                    System.out.println(
                            Pattern.matches(phoneRegex, user[2])
                                    ? "Số điện thoại hợp lệ"
                                    : "Số điện thoại không hợp lệ"
                    );
                    break;

                case 5:
                    if (user[3] == null) {
                        System.out.println("Chưa nhập mật khẩu!");
                        break;
                    }
                    // Ít nhất 8 ký tự, có chữ hoa, chữ thường, số, ký tự đặc biệt
                    String passRegex =
                            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

                    System.out.println(
                            Pattern.matches(passRegex, user[3])
                                    ? "Mật khẩu hợp lệ"
                                    : "Mật khẩu không hợp lệ"
                    );
                    break;

                case 6:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }
}
