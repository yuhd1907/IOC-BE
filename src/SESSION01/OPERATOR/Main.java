package SESSION01.OPERATOR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Arithmetic arithmetic = new Arithmetic(a, b);
        System.out.println("firstNumber = " + arithmetic.getFirstNumber());
        System.out.println("secondNumber = " + arithmetic.getSecondNumber());
        System.out.println("Tổng = " + arithmetic.getSum());
        System.out.println("Hiệu = " + arithmetic.getDifference());
        System.out.println("Tích = " + arithmetic.getProduct());
        System.out.println("Thương = " + arithmetic.getDivision());
        System.out.println("Phần dư = " + arithmetic.getSurplus());
    }
}
