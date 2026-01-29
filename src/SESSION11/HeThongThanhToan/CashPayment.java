package SESSION11.HeThongThanhToan;

public class CashPayment extends Payment{

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Thanh toán bằng tiền mặt");
        printAmount();
    }
}
