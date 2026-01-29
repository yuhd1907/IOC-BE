package SESSION11.QuanLyHinhHoc;

import SESSION11.QuanLyHinhHoc.cir.Circle;
import SESSION11.QuanLyHinhHoc.rect.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("Rectangle", 4, 6);
        shapes[1] = new Circle("Circle", 3);

        for (Shape s : shapes) {
            s.displayInfo();
            System.out.println("Diện tích: " + s.getArea());
            System.out.println("Chu vi: " + s.getPerimeter());

            if (s instanceof Drawable) {
                ((Drawable) s).draw();
            }
        }
    }
}
