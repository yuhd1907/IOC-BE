package SESSION11.HeThongThanhToan;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        payments[0] = new CashPayment(500000);
        payments[1] = new CreditCardPayment(1200000);
        payments[2] = new EWalletPayment(300000);

        for (Payment p : payments) {
            p.pay();

            if (p instanceof Refundable) {
                ((Refundable) p).refund();
            }
        }
    }
}
