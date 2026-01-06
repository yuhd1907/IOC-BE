package SESSION01.RECTANGLE;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getArea() {
        return width * height;
    }

    public float getPerimeter() {
        return (width + height) * 2;
    }
}
