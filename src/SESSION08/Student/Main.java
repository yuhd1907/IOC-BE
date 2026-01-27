package SESSION08.Student;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1, "Nguyen Van A", 18);
        System.out.println(
                "ID: " + sv1.getId() +
                        ", Name: " + sv1.getName() +
                        ", Age: " + sv1.getAge()
        );
    }
}
