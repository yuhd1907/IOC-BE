package SESSION11.QuanLyHinhHoc;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void displayInfo() {
        System.out.println("Name: " + this.getName());
    }
}
