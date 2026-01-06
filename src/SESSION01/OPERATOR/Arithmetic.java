package SESSION01.OPERATOR;

public class Arithmetic {
    private int firstNumber;
    private int secondNumber;

    public Arithmetic(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getSum() {
        return firstNumber + secondNumber;
    }

    public int getDifference() {
        return firstNumber - secondNumber;
    }

    public long getProduct() {
        return (long) firstNumber * secondNumber;
    }

    public int getDivision() {
        return firstNumber / secondNumber;
    }

    public int getSurplus() {
        return firstNumber % secondNumber;
    }
}
