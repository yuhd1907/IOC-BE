package SESSION13.presentation;

import SESSION13.manager.UserManager;
import SESSION13.model.Person;

import java.util.Scanner;

public class UserView {
    private static final UserManager userManager = new UserManager();

    public static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n**************** MENU QUẢN LÝ NGƯỜI DÙNG ****************");
            System.out.println("""
                    1. Thêm người dùng
                    2. Xóa người dùng
                    3. Hiển thị danh sách người dùng
                    4. Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addUser(scanner);
                    break;
                case 2:
                    deleteUser(scanner);
                    break;
                case 3:
                    userManager.display();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.err.println("Lựa chọn không tồn tại. Vui lòng chọn lại!!!");
            }
        }
    }

    private static void addUser(Scanner scanner) {
        Person person = new Person();
        person.inputData(scanner);
        userManager.add(person);
        System.out.println("Người dùng đã được thêm thành công.");
    }

    private static void deleteUser(Scanner scanner) {
        System.out.print("Nhập email người dùng để xóa: ");
        String email = scanner.nextLine();
        int index = userManager.findIndexByEmail(email);

        if (index != -1) {
            userManager.delete(index);
            System.out.println("Người dùng đã được xóa thành công.");
        } else {
            System.err.println("Không tồn tại người dùng!");
        }
    }
}
