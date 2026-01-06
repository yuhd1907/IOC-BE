package SESSION01.SUMFRACTION;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public String getSum(Fraction f){
        f.numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        f.denominator = this.denominator * f.denominator;
        return String.format("%d/%d", f.numerator, f.denominator);
    }
}
