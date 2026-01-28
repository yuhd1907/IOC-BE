package SESSION10.Bai3;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        double p1 = computer.calculatePrice(1000);
        System.out.println("Giá cuối cùng: " + p1);
        System.out.println("-------------------");

        double p2 = computer.calculatePrice(1000, 0.1);
        System.out.println("Giá cuối cùng: " + p2);
        System.out.println("-------------------");

        double p3 = computer.calculatePrice(1000, 0.1, 0.2);
        System.out.println("Giá cuối cùng: " + p3);
    }
}
