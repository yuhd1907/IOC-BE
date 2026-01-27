package SESSION09.Retangle;

public class Retangle {
    private double width;
    private double height;

    public Retangle() {
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public void printInfo() {
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}
