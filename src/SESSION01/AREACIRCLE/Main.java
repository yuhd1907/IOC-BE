package SESSION01.AREACIRCLE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Circle c = new Circle(r);
        float A = c.getArea();
        System.out.printf("%.2f", A);
    }
}
