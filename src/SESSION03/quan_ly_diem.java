package SESSION03;

import java.util.Scanner;

public class quan_ly_diem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo các biến lưu trữ thống kê (nằm ngoài vòng lặp menu để lưu giữ giá trị)
        int soHocVien = 0;
        double tongDiem = 0;
        double diemCaoNhat = 0;
        double diemThapNhat = 10; // Khởi tạo là 10 để so sánh tìm min

        int luaChon;

        // Vòng lặp do-while để hiển thị menu liên tục
        do {
            System.out.println("\n=========== QUẢN LÝ ĐIỂM SỐ ===========");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (1-3): ");
            luaChon = scanner.nextInt();

            // Sử dụng switch-case để rẽ nhánh chức năng
            switch (luaChon) {
                case 1:
                    System.out.println("\n--- NHẬP ĐIỂM (Nhập -1 để dừng) ---");
                    // Vòng lặp while(true) để nhập liên tục cho đến khi gặp -1
                    while (true) {
                        System.out.print("Nhập điểm cho học viên thứ " + (soHocVien + 1) + ": ");
                        double diem = scanner.nextDouble();

                        // Kiểm tra điều kiện thoát: Sử dụng break
                        if (diem == -1) {
                            System.out.println("Đã kết thúc quá trình nhập.");
                            break;
                        }

                        // Kiểm tra tính hợp lệ: Sử dụng continue
                        if (diem < 0 || diem > 10) {
                            System.out.println("Điểm không hợp lệ. Nhập lại.");
                            continue; // Bỏ qua các lệnh bên dưới, quay lại đầu vòng lặp
                        }

                        // --- Xử lý xếp loại (Sử dụng if-else if) ---
                        String xepLoai = "";
                        if (diem < 5) {
                            xepLoai = "Yếu";
                        } else if (diem < 7) {
                            xepLoai = "Trung Bình";
                        } else if (diem < 8) {
                            xepLoai = "Khá";
                        } else if (diem < 9) {
                            xepLoai = "Giỏi";
                        } else {
                            xepLoai = "Xuất sắc";
                        }
                        System.out.println("-> Xếp loại: " + xepLoai);

                        // --- Tính toán thống kê ---
                        soHocVien++;         // Tăng số lượng
                        tongDiem += diem;    // Cộng dồn điểm

                        // Cập nhật Min/Max
                        if (diem > diemCaoNhat) {
                            diemCaoNhat = diem;
                        }
                        // Nếu là học viên đầu tiên thì gán luôn min = điểm đó
                        if (soHocVien == 1) {
                            diemThapNhat = diem;
                        } else if (diem < diemThapNhat) {
                            diemThapNhat = diem;
                        }
                    }
                    break; // Thoát khỏi case 1

                case 2:
                    System.out.println("\n--- THỐNG KÊ KẾT QUẢ ---");
                    if (soHocVien == 0) {
                        System.out.println("Chưa có dữ liệu! Vui lòng nhập điểm trước.");
                    } else {
                        double diemTrungBinh = tongDiem / soHocVien;
                        System.out.println("Số học viên đã nhập: " + soHocVien);
                        // Làm tròn điểm trung bình 2 số lẻ cho đẹp
                        System.out.printf("Điểm trung bình    : %.2f\n", diemTrungBinh);
                        System.out.println("Điểm cao nhất      : " + diemCaoNhat);
                        System.out.println("Điểm thấp nhất     : " + diemThapNhat);
                    }
                    break; // Thoát khỏi case 2

                case 3:
                    System.out.println("Cảm ơn đã sử dụng chương trình. Tạm biệt!");
                    System.exit(0); // Lệnh thoát chương trình ngay lập tức
                    break;

                default:
                    System.out.println(">> Chức năng không tồn tại. Vui lòng chọn lại (1-3)!");
            }

        } while (luaChon != 3); // Điều kiện lặp lại menu nếu chưa chọn thoát
    }
}
