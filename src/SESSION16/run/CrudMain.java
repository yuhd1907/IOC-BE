package SESSION16.run;

import SESSION16.service.IProductService;
import SESSION16.service.impl.ProductServiceImpl;

import java.util.Scanner;

public class CrudMain {

    public static void main(String[] args) {

        IProductService productService = new ProductServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Product Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Filter Products (Price > 100)");
            System.out.println("6. Total Value of Products");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.displayProducts();
                    break;
                case 5:
                    productService.filterProducts();
                    break;
                case 6:
                    productService.totalValue();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
