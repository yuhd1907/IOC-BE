package SESSION11.QuanLyHinhHoc.rect;

import SESSION11.QuanLyHinhHoc.Drawable;
import SESSION11.QuanLyHinhHoc.Shape;

public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật");
    }
}
