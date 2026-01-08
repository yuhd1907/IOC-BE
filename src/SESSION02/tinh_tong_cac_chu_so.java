package SESSION02;

import java.util.Scanner;

public class tinh_tong_cac_chu_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sum = 0;
        if (n < 0) {
            n = -n;
        }
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Tổng các chữ số là: " + sum);
    }
}
