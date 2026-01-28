package SESSION10.Bai4;

public class Car {
    int currentSpeed = 0;

    // Tăng tốc mặc định
    public void accelerate() {
        currentSpeed += 10;
        System.out.println("Car accelerates by default: +10 km/h");
    }

    // Tăng tốc theo tốc độ truyền vào
    public void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Car accelerates by " + speed + " km/h");
    }

    // Tăng tốc theo tốc độ và thời gian
    public void accelerate(int speed, int seconds) {
        int increase = speed * seconds;
        currentSpeed += increase;
        System.out.println("Car accelerates " + increase + " km/h (speed x time)");
    }

    public void printStatus() {
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }
}
