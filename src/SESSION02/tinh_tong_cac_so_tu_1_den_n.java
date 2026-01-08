package SESSION02;

import java.util.Scanner;

public class tinh_tong_cac_so_tu_1_den_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n <= 0)
            System.out.println("Số nhập vào không hợp lệ");
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.printf("Tổng các chữ số từ 1 đến %d là: %d\n", n, sum);
    }
}
