package SESSION15.QuanLySanPhamvaDonHang;

import java.util.*;

public class Main {

    static List<Product> productList = new ArrayList<>();
    static Map<String, Order> orderMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Hiển thị sản phẩm");
            System.out.println("4. Tạo đơn hàng");
            System.out.println("5. Thêm sản phẩm vào đơn hàng");
            System.out.println("6. Hiển thị đơn hàng");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            try {
                switch (choice) {
                    case 1 -> addProduct();
                    case 2 -> removeProduct();
                    case 3 -> displayProducts();
                    case 4 -> createOrder();
                    case 5 -> addProductToOrder();
                    case 6 -> displayOrder();
                    case 0 -> {
                        System.out.println("Thoát chương trình.");
                        return;
                    }
                    default -> System.out.println("Lựa chọn không hợp lệ!");
                }
            } catch (BusinessException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }

    // ====== PRODUCT ======

    static void addProduct() throws BusinessException {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());

        Product p = new Product(id, name, price);
        productList.add(p);

        System.out.println("Thêm sản phẩm thành công!");
    }

    static void removeProduct() throws BusinessException {
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        Product product = productList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new BusinessException("Sản phẩm không tồn tại!"));

        productList.remove(product);
        System.out.println("Xóa thành công!");
    }

    static void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        productList.forEach(System.out::println);
    }

    // ====== ORDER ======

    static void createOrder() {
        System.out.print("Nhập mã đơn hàng: ");
        String orderCode = sc.nextLine();

        orderMap.put(orderCode, new Order(orderMap.size() + 1));
        System.out.println("Tạo đơn hàng thành công!");
    }

    static void addProductToOrder() throws BusinessException {
        System.out.print("Nhập mã đơn hàng: ");
        String orderCode = sc.nextLine();

        Order order = orderMap.get(orderCode);
        if (order == null) {
            throw new BusinessException("Đơn hàng không tồn tại!");
        }

        System.out.print("Nhập ID sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());

        Product product = productList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new BusinessException("Sản phẩm không tồn tại!"));

        order.addProduct(product);
        System.out.println("Thêm vào đơn hàng thành công!");
    }

    static void displayOrder() throws BusinessException {
        System.out.print("Nhập mã đơn hàng: ");
        String orderCode = sc.nextLine();

        Order order = orderMap.get(orderCode);
        if (order == null) {
            throw new BusinessException("Đơn hàng không tồn tại!");
        }

        System.out.println(order);
    }
}
