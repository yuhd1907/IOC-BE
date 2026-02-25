package SESSION16.run;

import SESSION16.model.Product;
import SESSION16.processor.ProductProcessor;
import SESSION16.processor.impl.ProductProcessorImpl;

import java.util.ArrayList;
import java.util.List;

public class ProcessorMain {

    public static void main(String[] args) {

        // Tạo danh sách mẫu
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Milk", 50));
        products.add(new Product(2, "Laptop", 2000));
        products.add(new Product(3, "Book", 120));

        ProductProcessor processor = new ProductProcessorImpl();

        // ===== In danh sách (static method) =====
        System.out.println("Product List:");
        ProductProcessor.printProductList(products);

        // ===== Kiểm tra sản phẩm > 100 (default method) =====
        boolean hasExpensive = processor.hasExpensiveProduct(products);
        System.out.println("\nHas product price > 100? " + hasExpensive);

        // ===== Tính tổng (abstract method) =====
        double total = processor.calculateTotalValue(products);
        System.out.println("Total value: " + total);
    }
}
