package SESSION11.QuanLyHinhHoc.cir;

import SESSION11.QuanLyHinhHoc.Drawable;
import SESSION11.QuanLyHinhHoc.Shape;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }
}
