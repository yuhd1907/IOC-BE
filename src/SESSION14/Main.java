package SESSION14;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> validPhones = new ArrayList<>();
        Map<String, String> invalidPhones = new LinkedHashMap<>();

        System.out.println("Nhập các số điện thoại (cách nhau bằng dấu phẩy):");
        String input = sc.nextLine();

        // Tách chuỗi theo dấu phẩy
        String[] phones = input.split(",");

        for (String phone : phones) {

            phone = phone.trim(); // loại bỏ khoảng trắng đầu/cuối

            try {
                InvalidPhoneNumberLengthException.validatePhoneNumber(phone);
                validPhones.add(phone);

            } catch (InvalidPhoneNumberLengthException e) {
                invalidPhones.put(phone, e.getMessage());
            }
        }

        // ====== HIỂN THỊ KẾT QUẢ ======

        System.out.println("\nSố điện thoại hợp lệ:");
        for (String phone : validPhones) {
            System.out.println("- " + phone);
        }

        System.out.println("\nSố điện thoại không hợp lệ:");
        for (Map.Entry<String, String> entry : invalidPhones.entrySet()) {
            System.out.println("- " + entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
