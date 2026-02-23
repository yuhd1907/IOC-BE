package SESSION14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chuyen_doi_so_thanh_chuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        System.out.println("Nhập các chuỗi (gõ exit để dừng): ");
        while (true) {
            System.out.print("Nhập chuỗi: ");
            String s =  sc.nextLine();
            if (s.equalsIgnoreCase("exit")) {
                break;
            }
            try{
                int n = Integer.parseInt(s);
                list.add(n);
            } catch (NumberFormatException e){
                cnt++;
            }
        }
        System.out.println("Số lượng chuỗi hợp lệ: " + list.size());
        System.out.println("Số lượng chuỗi không hợp lệ: " + cnt);
        System.out.println("Danh sách số nguyên hợp lệ: " + list);
    }
}
