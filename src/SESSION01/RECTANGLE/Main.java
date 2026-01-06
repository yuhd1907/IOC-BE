package SESSION01.RECTANGLE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(sc.nextFloat(), sc.nextFloat());
        System.out.printf("Diện tích: %.2f\n", r.getArea());
        System.out.printf("Chu vi: %.2f\n", r.getPerimeter());
    }
}
