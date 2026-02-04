package SESSION13.manager;

import SESSION13.model.Order;

import java.util.ArrayList;

public class OrderManager implements Manage<Order> {
    private ArrayList<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
        orders.add(new Order("OD0001", "Nguyen Cong Huong", "Laptop", 15000000));
    }

    @Override
    public void add(Order item) {
        orders.add(item);
    }

    @Override
    public void update(int index, Order item) {
        if (index >= 0 && index < orders.size()) {
            orders.set(index, item);
        } else {
            System.err.println("Không tồn tại đơn hàng!");
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < orders.size()) {
            orders.remove(index);
        } else {
            System.err.println("Không tồn tại đơn hàng!");
        }
    }

    @Override
    public void display() {
        if (orders.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            System.out.println("+------------+---------------------------+---------------------------+--------------+");
            System.out.printf("| %-10s | %-25s | %-25s | %-12s |\n", "Mã đơn", "Tên khách hàng", "Tên sản phẩm", "Giá");
            System.out.println("+------------+---------------------------+---------------------------+--------------+");
            for (Order order : orders) {
                order.displayData();
            }
        }
    }

    public int findIndexById(String id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
