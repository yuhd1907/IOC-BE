package SESSION01.AREACIRCLE;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public float getArea() {
        return (float) (radius * radius * Math.PI);
    }
}
