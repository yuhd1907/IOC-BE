package SESSION15.QuanLyMonHoc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static SubjectManager<Subject> manager = new SubjectManager<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== QUẢN LÝ MÔN HỌC =====");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm môn học");
            System.out.println("3. Xóa môn học");
            System.out.println("4. Tìm kiếm môn học theo tên");
            System.out.println("5. Lọc môn học theo tín chỉ > 3");
            System.out.println("6. Thoát");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> manager.displayAll();
                case 2 -> addSubject();
                case 3 -> deleteSubject();
                case 4 -> searchSubject();
                case 5 -> filterSubject();
                case 6 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Chức năng không hợp lệ!");
            }
        }
    }

    static void addSubject() {
        try {
            System.out.print("Nhập code: ");
            String code = sc.nextLine();

            System.out.print("Nhập tên môn học: ");
            String name = sc.nextLine();

            System.out.print("Nhập số tín chỉ: ");
            int credits = Integer.parseInt(sc.nextLine());

            if (credits < 0 || credits > 10) {
                throw new InvalidCreditsException("Tín chỉ phải từ 0 đến 10!");
            }

            System.out.print("Nhập ngày bắt đầu (dd-MM-yyyy): ");
            LocalDate startDate = LocalDate.parse(sc.nextLine(), formatter);

            manager.addSubject(new Subject(code, name, credits, startDate));
            System.out.println("Thêm môn học thành công!");

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Tín chỉ phải là số!");
        } catch (InvalidCreditsException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("Lỗi: Sai định dạng ngày (dd-MM-yyyy)!");
        }
    }

    static void deleteSubject() {
        System.out.print("Nhập code môn học cần xóa: ");
        String code = sc.nextLine();

        if (manager.deleteByCode(code))
            System.out.println("Xóa thành công.");
        else
            System.out.println("Không tìm thấy môn học.");
    }

    static void searchSubject() {
        System.out.print("Nhập tên môn học cần tìm: ");
        String name = sc.nextLine();

        Optional<Subject> result = manager.findByName(name);

        result.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Không có môn học phù hợp.")
        );
    }

    static void filterSubject() {
        List<Subject> list = manager.filterByCreditsGreaterThan(3);

        if (list.isEmpty())
            System.out.println("Không có môn học nào > 3 tín chỉ.");
        else
            list.forEach(System.out::println);
    }
}
