package SESSION14;

import java.util.Scanner;

public class BankAccount {

    private static final double MIN_BALANCE = 50000;
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Lỗi: Số tiền rút phải lớn hơn 0!");
            return;
        }

        if (amount > balance) {
            System.out.println("Lỗi: Số tiền rút vượt quá số dư!");
            return;
        }

        if ((balance - amount) < MIN_BALANCE) {
            System.out.println("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
            return;
        }

        balance -= amount;
        System.out.println("Rút tiền thành công!");
        System.out.println("Số tiền đã rút: " + amount + " đồng");
        System.out.println("Số dư còn lại: " + balance + " đồng");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1_000_000);

        System.out.println("=== CHƯƠNG TRÌNH RÚT TIỀN ===");
        System.out.println("Số dư hiện tại: 1.000.000 đồng");

        while (true) {
            try {
                System.out.print("\nNhập số tiền muốn rút (0 để thoát): ");
                String input = sc.nextLine();

                double amount = Double.parseDouble(input);

                if (amount == 0) {
                    System.out.println("Kết thúc chương trình.");
                    break;
                }

                account.withdraw(amount);

            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
            }
        }

        sc.close();
    }
}