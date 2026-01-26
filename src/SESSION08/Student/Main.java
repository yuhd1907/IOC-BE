package SESSION08.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyen Van A", 20, 3.2);
        Student s2 = new Student(2, "Tran Thi B", 21, 3.8);
        Student s3 = new Student(3, "Le Van C", 19, 2.5);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        System.out.println("Total students: " + Student.getCount());
    }
}
