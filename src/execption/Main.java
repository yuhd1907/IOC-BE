package execption;

import java.util.Scanner;

public class Main {
    public static void getQuotient() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập 1 số thực: ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập 1 số thực: ");
            double b = Double.parseDouble(sc.nextLine());
            if (b == 0) {
                throw new ArithmeticException();
            }
            System.out.printf("Result: %.2f\n", a / b);
        } catch (NumberFormatException e) {
            System.err.println("Vui lòng nhập số thực!");
        } catch (ArithmeticException e) {
            System.err.println("b phải khác 0!");
        }
    }

    public static void main(String[] args) {
        getQuotient();
        System.out.println("Kết thúc chương trình.");
    }
}
