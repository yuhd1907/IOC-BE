package SESSION07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        b.title = sc.nextLine();
        b.author = sc.nextLine();
        b.price = Double.parseDouble(sc.nextLine());

        b.printInfo();
    }
}
