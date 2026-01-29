package SESSION11.QuanLyCacThietBiDienTu;

public class SmartPhone extends Device implements Connectable, Chargeable {
    public SmartPhone(int id, String name) {
        super(id, name);
    }

    @Override
    public void charge() {
        System.out.println("SmartPhone " + getName() + " is charging");
    }

    @Override
    public void connectWifi() {
        System.out.println("SmartPhone " + getName() + " is connecting to WIFI");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartPhone " + getName() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartPhone " + getName() + " is turning off");
    }
}
