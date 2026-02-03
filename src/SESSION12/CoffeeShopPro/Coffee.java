package SESSION12.CoffeeShopPro;

public class Coffee extends Drink {
    public Coffee(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void prepare() {
        System.out.println("Pha bằng máy");
    }

    @Override
    public void applyDiscount(double percentage) {

    }
}
