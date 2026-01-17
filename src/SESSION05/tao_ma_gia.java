package SESSION05;

import java.util.Random;
import java.util.Scanner;

public class tao_ma_gia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Nhập n (1 ≤ n ≤ 1000): ");
        int n = sc.nextInt();

        if (n < 1 || n > 1000) {
            System.out.println("n không hợp lệ!");
            return;
        }

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digit = "0123456789";

        String allChars = upper + lower + digit;

        StringBuilder result = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(allChars.length());
            result.append(allChars.charAt(index));
        }

        System.out.println("Chuỗi ngẫu nhiên:");
        System.out.println(result.toString());

        sc.close();
    }
}
