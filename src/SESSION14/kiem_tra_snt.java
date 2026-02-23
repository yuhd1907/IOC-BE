package SESSION14;

import java.util.Scanner;

public class kiem_tra_snt {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập 1 số nguyên: ");
            int n = Integer.parseInt(sc.nextLine());
            if (n <= 0){
                System.out.print("Nhập lại số nguyên không được <= 0: ");
                n = Integer.parseInt(sc.nextLine());
            }
            if(isPrime(n)) {
                System.out.println("Đây là số nguyên tố.");
            } else {
                System.out.println("Đây không phải số nguyên tố");
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập 1 số nguyên!");
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solve();
        System.out.println("Kết thúc chương trình.");
    }
}
