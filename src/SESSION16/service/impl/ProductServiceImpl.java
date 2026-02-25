package SESSION16.service.impl;

import SESSION16.model.Product;
import SESSION16.service.IProductService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {

    private Map<Integer, Product> productMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = Integer.parseInt(sc.nextLine());

        if (productMap.containsKey(id)) {
            System.out.println("ID already exists!");
            return;
        }

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = Double.parseDouble(sc.nextLine());

        productMap.put(id, new Product(id, name, price));
        System.out.println("Product added successfully.");
    }

    @Override
    public void editProduct() {
        System.out.print("Enter Product ID to edit: ");
        int id = Integer.parseInt(sc.nextLine());

        Product product = productMap.get(id);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.print("Enter new Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter new Product Price: ");
        double price = Double.parseDouble(sc.nextLine());

        product.setName(name);
        product.setPrice(price);

        System.out.println("Product updated successfully.");
    }

    @Override
    public void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());

        if (productMap.remove(id) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    @Override
    public void displayProducts() {
        if (productMap.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        productMap.values().forEach(System.out::println);
    }

    @Override
    public void filterProducts() {
        System.out.println("Products with price greater than 100:");

        productMap.values().stream()
                .filter(p -> p.getPrice() > 100)
                .forEach(System.out::println);
    }

    @Override
    public void totalValue() {
        double total = productMap.values().stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("Total value of products: " + total);
    }
}
