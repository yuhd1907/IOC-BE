package SESSION13.presentation;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        run(input);
    }

    public static void run(Scanner input) {
        while (true) {
            System.out.println("\n================== MENU CHÍNH ==================");
            System.out.println("""
                    3. Quản lý Đơn hàng (Order)
                    4. Quản lý Hóa đơn (Invoice)
                    5. Quản lý Điểm danh (Attendance)
                    6. Quản lý Người dùng (User)
                    7. Thoát
                    """);
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    OrderView.showMenu(input);
                    break;
                case 2:
                    InvoiceView.showMenu(input);
                    break;
                case 3:
                    AttendanceView.showMenu(input);
                    break;
                case 4:
                    UserView.showMenu(input);
                    break;
                case 5:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình. Tạm biệt!");
                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        }
    }
}
