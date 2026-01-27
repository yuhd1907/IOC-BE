package SESSION08.QuyDoiTienTe;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter.setRate(25000);

        int vnd = 100000;
        double usd = CurrencyConverter.toUSD(vnd);

        System.out.println("USD: " + CurrencyConverter.formatUSD(usd));
    }
}
