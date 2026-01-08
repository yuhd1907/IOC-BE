package SESSION02;

import java.util.Scanner;

public class kiem_tra_tinh_hop_le_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < 0 || b < 0 || c < 0) System.out.println("Ba cạnh không tạo thành tam giác.");
        else if (a + b <= c || b + c <= a || c + a <= b) System.out.println("Ba cạnh không tạo thành tam giác.");
        else {
            if(a == b && b == c) System.out.println("Đây là tam giác đều.");
            else if(a == b || b == c || c == a) System.out.println("Đây là tam giác cân.");
            else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2))
                System.out.println("Đây là tam giác vuông.");
            else System.out.println("Đây là tam giác thường.");
        }
    }
}
