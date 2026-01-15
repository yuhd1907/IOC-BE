package SESSION04;

import java.util.Scanner;

public class tinh_tong_chan_le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int col = sc.nextInt();
        System.out.println("Nhập các phần tử của mảng");
        int[][] arr = new int[row][col];
        int tongChan = 0;
        int tongLe = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 0) tongChan += arr[i][j];
                else tongLe += arr[i][j];
            }
        }

        System.out.printf("Tổng các số chẵn: %d\n", tongChan);
        System.out.printf("Tông các số lẻ: %d\n", tongLe);
    }
}
