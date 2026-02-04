package SESSION13.presentation;

import SESSION13.manager.AttendanceManager;
import SESSION13.model.AttendanceStudent;

import java.util.Scanner;

public class AttendanceView {
    private static final AttendanceManager attendanceManager = new AttendanceManager();

    public static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n**************** MENU QUẢN LÝ ĐIỂM DANH ****************");
            System.out.println("""
                    1. Thêm sinh viên
                    2. Sửa sinh viên
                    3. Xóa sinh viên
                    4. Hiển thị danh sách sinh viên
                    5. Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    attendanceManager.display();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.err.println("Lựa chọn không tồn tại. Vui lòng chọn lại!!!");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        AttendanceStudent student = new AttendanceStudent();
        student.inputData(scanner);
        attendanceManager.add(student);
        System.out.println("Sinh viên đã được thêm thành công.");
    }

    private static void updateStudent(Scanner scanner) {
        System.out.print("Nhập id sinh viên cần sửa: ");
        String id = scanner.nextLine();
        int index = attendanceManager.findIndexById(id);

        if (index != -1) {
            AttendanceStudent newStudent = new AttendanceStudent();
            newStudent.setId(id);
            System.out.print("Nhập tên mới sinh viên: ");
            newStudent.setName(scanner.nextLine());
            attendanceManager.update(index, newStudent);
            System.out.println("Sinh viên đã được sửa thành công.");
        } else {
            System.err.println("Không tồn tại sinh viên!");
        }
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Nhập id sinh viên cần xóa: ");
        String id = scanner.nextLine();
        int index = attendanceManager.findIndexById(id);

        if (index != -1) {
            attendanceManager.delete(index);
            System.out.println("Đã xóa thành công sinh viên!");
        } else {
            System.err.println("Không tồn tại sinh viên!");
        }
    }
}
