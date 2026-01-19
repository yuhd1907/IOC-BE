package SESSION06;

import java.util.Arrays;
import java.util.Scanner;

public class quan_ly_diem_sinh_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] dsDiem = null;
        int n = 0;
        int choice;

        do {
            System.out.println("************* QUẢN LÝ ĐIỂM SV *************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    n = sc.nextInt();
                    dsDiem = new double[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập điểm sinh viên " + (i + 1) + ": ");
                        dsDiem[i] = sc.nextDouble();
                    }
                    break;

                case 2:
                    if (dsDiem == null) {
                        System.out.println("Chưa nhập danh sách!");
                        break;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println(dsDiem[i]);
                    }
                    break;

                case 3:
                    if (dsDiem == null) break;
                    double sum = 0;
                    for (int i = 0; i < n; i++) sum += dsDiem[i];
                    System.out.println("Điểm trung bình: " + sum / n);
                    break;

                case 4:
                    if (dsDiem == null) break;
                    double max = dsDiem[0], min = dsDiem[0];
                    for (int i = 1; i < n; i++) {
                        if (dsDiem[i] > max) max = dsDiem[i];
                        if (dsDiem[i] < min) min = dsDiem[i];
                    }
                    System.out.println("Điểm cao nhất: " + max);
                    System.out.println("Điểm thấp nhất: " + min);
                    break;

                case 5:
                    if (dsDiem == null) break;
                    int dat = 0, truot = 0;
                    for (int i = 0; i < n; i++) {
                        if (dsDiem[i] >= 5) dat++;
                        else truot++;
                    }
                    System.out.println("Đạt: " + dat);
                    System.out.println("Trượt: " + truot);
                    break;

                case 6:
                    if (dsDiem == null) break;
                    Arrays.sort(dsDiem);
                    System.out.println("Đã sắp xếp tăng dần");
                    break;

                case 7:
                    if (dsDiem == null) break;
                    int gioiXS = 0;
                    for (int i = 0; i < n; i++) {
                        if (dsDiem[i] >= 8) gioiXS++;
                    }
                    System.out.println("Số SV giỏi & xuất sắc: " + gioiXS);
                    break;

                case 8:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 8);
    }
}
