package SESSION11.QuanLyCacThietBiDienTu;

public class Main {
    public static void main(String[] args) {
        Device[] device = new Device[3];
        device[0] = new SmartPhone(1, "Iphone 17");
        device[1] = new Laptop(2, "Macbook Pro");
        device[2] = new Television(3, "LG");

        for (Device d : device) {
            d.turnOn();
            if(d instanceof Connectable) {
                ((Connectable) d).connectWifi();
            }
            if(d instanceof Chargeable) {
                ((Chargeable) d).charge();
            }
            d.turnOff();
            System.out.println();
        }
    }
}
