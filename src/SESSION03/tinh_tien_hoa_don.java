package SESSION03;

import java.util.Locale;
import java.util.Scanner;

public class tinh_tien_hoa_don {
    public static void main(String[] args) {
        // Sử dụng Locale tiếng Việt để in số có dấu chấm ngăn cách (1.200.000)
        Locale vietnamese = new Locale("vi", "VN");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tên khách hàng: ");
        String tenKhach = scanner.nextLine();

        System.out.print("Sản phẩm: ");
        String tenSanPham = scanner.nextLine();

        System.out.print("Giá: ");
        double gia = scanner.nextDouble();

        System.out.print("Số lượng: ");
        int soLuong = scanner.nextInt();

        System.out.print("Thẻ thành viên (true/false): ");
        boolean theThanhVien = scanner.nextBoolean();


        double thanhTien = gia * soLuong;
        double giamGia = theThanhVien ? (thanhTien * 0.1) : 0;
        double tienVAT = thanhTien * 0.08;
        double tongTien = thanhTien - giamGia + tienVAT;


        System.out.println("Khách hàng: " + tenKhach);
        System.out.println("Sản phẩm: " + tenSanPham);

        System.out.println("Giá: " + String.format(vietnamese, "%,.0f", gia) + " VNĐ");
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền: " + String.format(vietnamese, "%,.0f", thanhTien) + " VNĐ");

        System.out.println("Giảm giá: " + String.format(vietnamese, "%,.0f", giamGia));
        System.out.println("Tiền VAT: " + String.format(vietnamese, "%,.0f", tienVAT));

        System.out.println("Tổng tiền thanh toán: " + String.format(vietnamese, "%,.0f", tongTien) + " VNĐ");

        scanner.close();
    }
}
