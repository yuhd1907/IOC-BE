package SESSION16.processor;

import SESSION16.model.Product;

import java.util.List;

public interface ProductProcessor {

    // abstract
    double calculateTotalValue(List<Product> products);

    // static
    static void printProductList(List<Product> products) {
        products.forEach(System.out::println);
    }

    // default
    default boolean hasExpensiveProduct(List<Product> products) {
        return products.stream()
                .anyMatch(p -> p.getPrice() > 100);
    }
}
