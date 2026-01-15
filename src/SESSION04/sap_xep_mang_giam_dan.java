package SESSION04;

import java.util.Scanner;

public class sap_xep_mang_giam_dan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (int x : arr) System.out.printf("%d ", x);
    }
}
