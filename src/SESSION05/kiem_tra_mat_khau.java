package SESSION05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class kiem_tra_mat_khau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập mật khẩu
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();
        // Kiểm tra regex
        boolean lengthOK = Pattern.matches(".{8,}", password);
        boolean hasUpper = Pattern.matches(".*[A-Z].*", password);
        boolean hasLower = Pattern.matches(".*[a-z].*", password);
        boolean hasDigit = Pattern.matches(".*\\d.*", password);
        boolean hasSpecial = Pattern.matches(".*[@#$!%].*", password);
        // In output
        if (lengthOK && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Mật khẩu HỢP LỆ");
        } else {
            System.out.println("Mật khẩu KHÔNG HỢP LỆ");
        }
        sc.close();
    }
}
