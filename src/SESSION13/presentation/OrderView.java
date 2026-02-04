package SESSION13.presentation;

import SESSION13.manager.OrderManager;
import SESSION13.model.Order;

import java.util.Scanner;

public class OrderView {
    private static final OrderManager orderManager = new OrderManager();

    public static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n**************** MENU QUẢN LÝ ĐƠN HÀNG ****************");
            System.out.println("""
                    1. Thêm đơn hàng
                    2. Sửa đơn hàng
                    3. Xóa đơn hàng
                    4. Hiển thị danh sách đơn hàng
                    5. Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addOrder(scanner);
                    break;
                case 2:
                    updateOrder(scanner);
                    break;
                case 3:
                    deleteOrder(scanner);
                    break;
                case 4:
                    orderManager.display();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.err.println("Lựa chọn không tồn tại. Vui lòng chọn lại!!!");
            }
        }
    }

    private static void addOrder(Scanner scanner) {
        Order order = new Order();
        order.inputData(scanner);
        orderManager.add(order);
        System.out.println("Đơn hàng đã được thêm thành công.");
    }

    private static void updateOrder(Scanner scanner) {
        System.out.print("Nhập mã đơn hàng cần sửa: ");
        String id = scanner.nextLine();
        int index = orderManager.findIndexById(id);

        if (index != -1) {
            Order newOrder = new Order();
            newOrder.setId(id);
            System.out.print("Nhập tên khách hàng mới: ");
            newOrder.setCustomerName(scanner.nextLine());
            System.out.print("Nhập tên sản phẩm mới: ");
            newOrder.setProductName(scanner.nextLine());
            System.out.print("Nhập giá mới: ");
            newOrder.setPrice(Double.parseDouble(scanner.nextLine()));
            orderManager.update(index, newOrder);
            System.out.println("Đơn hàng đã được sửa thành công.");
        } else {
            System.err.println("Không tồn tại đơn hàng!");
        }
    }

    private static void deleteOrder(Scanner scanner) {
        System.out.print("Nhập mã đơn hàng cần xóa: ");
        String id = scanner.nextLine();
        int index = orderManager.findIndexById(id);

        if (index != -1) {
            orderManager.delete(index);
            System.out.println("Đơn hàng đã được xóa thành công.");
        } else {
            System.err.println("Không tồn tại đơn hàng!");
        }
    }
}
