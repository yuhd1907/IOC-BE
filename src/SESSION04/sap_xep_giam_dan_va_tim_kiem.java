package SESSION04;

import java.util.Scanner;

public class sap_xep_giam_dan_va_tim_kiem {
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
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (int x : arr) System.out.printf("%d ", x);
        System.out.println();
        System.out.print("Nhập số cần tìm: ");
        int k = sc.nextInt();
        System.out.printf("Tìm kiếm tuyến tính: Số %d có tại vị trí %d\n", k, linearSearch(k, arr));
        System.out.printf("Tìm kiếm nhị phân: Số %d có tại vị trí %d", k, binarySearch(k, arr));
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIdx])
                    minIdx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
    }

    public static int linearSearch(int k, int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (k == arr[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int k, int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (k == arr[mid]) {
                return mid;
            }
            if (arr[mid] > k) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
