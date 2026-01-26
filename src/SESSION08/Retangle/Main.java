package SESSION08.Retangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều rộng: ");
        double width = sc.nextDouble();

        System.out.print("Nhập chiều dài: ");
        double height = sc.nextDouble();

        Retangle rect = new Retangle(width, height);

        System.out.println("Diện tích: " + rect.getArea());
        System.out.println("Chu vi: " + rect.getPerimeter());

        rect.printInfo();
    }
}
