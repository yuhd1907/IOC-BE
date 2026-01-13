package SESSION03;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class quan_ly_luong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale vietnamese = new Locale("vi", "VN"); // Để in số tiền có dấu chấm phân cách

        // Sử dụng ArrayList để lưu trữ danh sách lương nhân viên
        // Điều này cần thiết để tính lại tiền thưởng ở Chức năng 3
        ArrayList<Double> danhSachLuong = new ArrayList<>();

        int luaChon;

        do {
            System.out.println("\n=========== QUẢN LÝ LƯƠNG NHÂN VIÊN ===========");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng");
            System.out.println("4. Thoát chương trình");
            System.out.print("Mời bạn chọn (1-4): ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.println("\n--- NHẬP LƯƠNG (Đơn vị: VNĐ, Nhập -1 để dừng) ---");
                    while (true) {
                        System.out.print("Nhập lương nhân viên thứ " + (danhSachLuong.size() + 1) + ": ");
                        double luong = scanner.nextDouble();

                        // 1. Sử dụng lệnh nhảy: break để thoát vòng lặp nhập
                        if (luong == -1) {
                            System.out.println("Đã kết thúc quá trình nhập.");
                            break;
                        }

                        // 2. Sử dụng lệnh nhảy: continue để bỏ qua giá trị sai
                        // Giới hạn 0 - 500 triệu (500,000,000)
                        if (luong < 0 || luong > 500_000_000) {
                            System.out.println(">> Lỗi: Lương phải từ 0 đến 500 triệu. Vui lòng nhập lại!");
                            continue;
                        }

                        // Thêm vào danh sách
                        danhSachLuong.add(luong);

                        // Phân loại nhân viên ngay khi nhập (if-else)
                        String phanLoai;
                        if (luong < 5_000_000) {
                            phanLoai = "Thu nhập thấp";
                        } else if (luong <= 15_000_000) {
                            phanLoai = "Thu nhập trung bình";
                        } else if (luong <= 50_000_000) {
                            phanLoai = "Thu nhập khá";
                        } else {
                            phanLoai = "Thu nhập cao";
                        }
                        System.out.println("-> Phân loại: " + phanLoai);
                    }
                    break;

                case 2:
                    System.out.println("\n--- THỐNG KÊ LƯƠNG ---");
                    if (danhSachLuong.isEmpty()) {
                        System.out.println("Chưa có dữ liệu! Vui lòng nhập lương trước.");
                    } else {
                        double tongLuong = 0;
                        double maxLuong = danhSachLuong.get(0);
                        double minLuong = danhSachLuong.get(0);

                        // Sử dụng vòng lặp foreach để duyệt danh sách
                        for (double luong : danhSachLuong) {
                            tongLuong += luong;
                            if (luong > maxLuong) maxLuong = luong;
                            if (luong < minLuong) minLuong = luong;
                        }

                        double luongTB = tongLuong / danhSachLuong.size();

                        System.out.println("Số nhân viên: " + danhSachLuong.size());
                        System.out.println("Lương thấp nhất: " + String.format(vietnamese, "%,.0f VNĐ", minLuong));
                        System.out.println("Lương cao nhất : " + String.format(vietnamese, "%,.0f VNĐ", maxLuong));
                        System.out.println("Lương trung bình: " + String.format(vietnamese, "%,.0f VNĐ", luongTB));
                        System.out.println("Tổng quỹ lương  : " + String.format(vietnamese, "%,.0f VNĐ", tongLuong));
                    }
                    break;

                case 3:
                    System.out.println("\n--- TÍNH TỔNG TIỀN THƯỞNG ---");
                    if (danhSachLuong.isEmpty()) {
                        System.out.println("Chưa có dữ liệu để tính thưởng.");
                    } else {
                        double tongThuong = 0;

                        // Duyệt lại danh sách để tính thưởng từng người
                        for (double luong : danhSachLuong) {
                            double tiLeThuong;

                            // Logic tính % thưởng theo đề bài
                            if (luong < 5_000_000) {
                                tiLeThuong = 0.05; // 5%
                            } else if (luong < 15_000_000) {
                                tiLeThuong = 0.10; // 10%
                            } else if (luong < 50_000_000) {
                                tiLeThuong = 0.15; // 15%
                            } else if (luong <= 100_000_000) {
                                tiLeThuong = 0.20; // 20%
                            } else {
                                tiLeThuong = 0.25; // 25% (cho > 100M)
                            }

                            double tienThuong = luong * tiLeThuong;
                            tongThuong += tienThuong;
                        }

                        System.out.println("Tổng số tiền thưởng cần chi trả: " + String.format(vietnamese, "%,.0f VNĐ", tongThuong));
                    }
                    break;

                case 4:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Chức năng không hợp lệ!");
            }

        } while (luaChon != 4);
    }
}
