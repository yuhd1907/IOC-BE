package SESSION02;

import java.util.Scanner;

public class tim_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String output;
        switch (month) {
            case 1:
                output = "Tháng 1 có 31 ngày";
                break;
            case 2:
                output = "Tháng 2 có 28 hoặc 29 ngày";
                break;
            case 3:
                output = "Tháng 3 có 31 ngày";
                break;
            case 4:
                output = "Tháng 4 có 30 ngày";
                break;
            case 5:
                output = "Tháng 5 có 31 ngày";
                break;
            case 6:
                output = "Tháng 6 có 30 ngày";
                break;
            case 7:
                output = "Tháng 7 có 31 ngày";
                break;
            case 8:
                output = "Tháng 8 có 31 ngày";
                break;
            case 9:
                output = "Tháng 9 có 30 ngày";
                break;
            case 10:
                output = "Tháng 10 có 31 ngày";
                break;
            case 11:
                output = "Tháng 11 có 30 ngày";
                break;
            case 12:
                output = "Tháng 12 có 31 ngày";
                break;
            default:
                output = "Tháng không hợp lệ";
                break;
        }
        System.out.println(output);
    }
}
