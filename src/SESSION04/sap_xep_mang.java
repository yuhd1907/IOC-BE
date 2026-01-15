package SESSION04;

import java.util.Scanner;

public class sap_xep_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("nhap cac phan tu mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] % 2 == 1 && a[j + 1] % 2 == 0) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        System.out.println("mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
