package SESSION12.CoffeeShopPro;

public class FruitTea extends Drink {
    public FruitTea(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void prepare() {
        System.out.println("Lắc với đá và trái cây tươi");
    }

    @Override
    public void applyDiscount(double percentage) {

    }
}
