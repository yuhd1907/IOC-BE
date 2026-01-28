package SESSION10.Bai3;

public class Computer {
    // Chỉ giá gốc
    public double calculatePrice(double basePrice) {
        System.out.println("Công thức: Giá gốc");
        return basePrice;
    }

    // Giá gốc + thuế
    public double calculatePrice(double basePrice, double tax) {
        System.out.println("Công thức: Giá gốc + Thuế");
        return basePrice + basePrice * tax;
    }

    // Giá gốc + thuế - giảm giá
    public double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("Công thức: Giá gốc + Thuế - Giảm giá");
        double priceWithTax = basePrice + basePrice * tax;
        return priceWithTax - priceWithTax * discount;
    }
}
