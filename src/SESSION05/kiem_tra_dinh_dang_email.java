package SESSION05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class kiem_tra_dinh_dang_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập địa chỉ email: ");
        String email = sc.nextLine().trim(); // loại bỏ khoảng trắng thừa

        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";

        boolean isValid = Pattern.matches(regex, email);

        if (isValid) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        sc.close();
    }
}
