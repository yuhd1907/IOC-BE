package SESSION11.QuanLyCacThietBiDienTu;

public class Television extends Device implements Connectable {
    public Television(int id, String name) {
        super(id, name);
    }

    @Override
    public void connectWifi() {
        System.out.println("Televison " + getName() + " is connecting to WIFI");
    }

    @Override
    public void turnOn() {
        System.out.println("Televison " + getName() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Televison " + getName() + " is turning off");
    }
}
