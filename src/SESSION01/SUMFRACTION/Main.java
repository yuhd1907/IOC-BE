package SESSION01.SUMFRACTION;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Fraction f1 = new Fraction(sc.nextInt(), sc.nextInt());
            Fraction f2 = new Fraction(sc.nextInt(), sc.nextInt());
            System.out.println(f1.getSum(f2));
        }
    }
}
