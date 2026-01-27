package SESSION08.QuyDoiTienTe;

public class CurrencyConverter {
    // Thuộc tính static lưu tỉ giá
    private static double rate;

    // Đặt tỉ giá
    public static void setRate(double r) {
        if (r <= 0) {
            System.out.println("Ti gia khong hop le!");
        } else {
            rate = r;
        }
    }

    // Lấy tỉ giá (optional)
    public static double getRate() {
        return rate;
    }

    // Chuyển đổi VND -> USD
    public static double toUSD(int vnd) {
        if (rate <= 0) {
            System.out.println("Chua thiet lap ti gia!");
            return 0;
        }
        return vnd / rate;
    }

    public static String formatUSD(double usd) {
        return String.format("%.2f", usd);
    }
}
