package SESSION08.ChuViDienTichHCN;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);

        Rectangle[] list = { r1, r2, r3 };

        // In thông tin từng hình
        for (int i = 0; i < list.length; i++) {
            Rectangle r = list[i];
            System.out.printf(
                    "Rectangle %d: width=%.1f, height=%.1f, area=%.2f, perimeter=%.1f%n",
                    i + 1,
                    r.getWidth(),
                    r.getHeight(),
                    r.getArea(),
                    r.getPerimeter()
            );
        }

        // Tìm diện tích lớn nhất
        double maxArea = list[0].getArea();
        int indexMax = 0;

        for (int i = 1; i < list.length; i++) {
            if (list[i].getArea() > maxArea) {
                maxArea = list[i].getArea();
                indexMax = i;
            }
        }

        Rectangle maxRect = list[indexMax];

        // In kết quả cuối
        System.out.printf(
                "%nLargest area = %.2f (Rectangle %d: width=%.1f, height=%.1f)",
                maxArea,
                indexMax + 1,
                maxRect.getWidth(),
                maxRect.getHeight()
        );
    }
}
