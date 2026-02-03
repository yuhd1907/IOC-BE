package SESSION12.TeachAsset;

public class NetworkDevice extends Asset{
    private int numberOfPorts;

    public NetworkDevice(String assetCode, String name, double purchasePrice, int numberOfPorts) {
        super(assetCode, name, purchasePrice);
        this.numberOfPorts = numberOfPorts;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Number Of Ports: " + numberOfPorts;
    }

    @Override
    public double getMarketValue() {
        return getPurchasePrice() * 0.9;
    }
}
