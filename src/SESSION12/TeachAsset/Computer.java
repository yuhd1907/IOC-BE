package SESSION12.TeachAsset;

public class Computer extends Asset {
    private int ram;
    private String cpu;

    public Computer(String assetCode, String name, double purchasePrice, int ram, String cpu) {
        super(assetCode, name, purchasePrice);
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return super.toString() +
                "RAM: " + ram + '\n' +
                "CPU: " + cpu;
    }

    @Override
    public double getMarketValue() {
        return getPurchasePrice() * 0.8;
    }
}
