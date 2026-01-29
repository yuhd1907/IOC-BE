package SESSION11.QuanLyCacThietBiDienTu;

public class Laptop extends Device implements Connectable, Chargeable {
    public Laptop(int id, String name) {
        super(id, name);
    }

    @Override
    public void charge() {
        System.out.println("Laptop " + getName() + " is charging");
    }

    @Override
    public void connectWifi() {
        System.out.println("Laptop " + getName() + " is connecting to WIFI");
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop " + getName() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop " + getName() + " is turning off");
    }
}
