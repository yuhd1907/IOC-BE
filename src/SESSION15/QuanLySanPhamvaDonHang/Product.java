package SESSION15.QuanLySanPhamvaDonHang;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) throws BusinessException {
        if (price <= 0) {
            throw new BusinessException("Giá sản phẩm phải > 0");
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Price: " + price;
    }
}

