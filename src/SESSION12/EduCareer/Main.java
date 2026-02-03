package SESSION12.EduCareer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] staff = new Staff[100];
        int size = 0;
        int choice;

        do {
            System.out.println("""
                    1. Thêm mới: Cho phép chọn thêm Giảng viên hoặc Nhân viên.
                    2. Hiển thị danh sách: Sử dụng Đa hình để duyệt mảng và gọi calculateTotalSalary() in ra lương thực nhận của từng người.
                    3. Cập nhật: Tìm theo id và sửa thông tin.
                    4. Xóa: Xóa nhân viên khỏi hệ thống theo id.
                    5. Thoát.
                    ----------------------------------------------
                    """);
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Lecturer");
                    System.out.println("2. AdminStaff");
                    System.out.print("Choose type: ");

                    int type = Integer.parseInt(sc.nextLine());

                    if (type == 1) {
                        System.out.print("Nhập id: ");
                        String id = sc.nextLine();
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập lương cơ bản: ");
                        double baseSalary = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhập số giờ dạy: ");
                        double teachingHours = Double.parseDouble(sc.nextLine());
                        staff[size++] = new Lecturer(id, name, baseSalary, teachingHours);
                    } else if (type == 2) {
                        System.out.print("Nhập id: ");
                        String id = sc.nextLine();
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập lương cơ bản: ");
                        double baseSalary = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhập thưởng: ");
                        double bonus = Double.parseDouble(sc.nextLine());
                        staff[size++] = new AdminStaff(id, name, baseSalary, bonus);
                    } else {
                        System.err.println("Nhập không hợp lệ!!!");
                    }
                    break;
                case 2:
                    if(size == 0){
                        System.out.println("Danh sách trống.");
                        return;
                    }

                    for(int i = 0; i < size; i++){
                        System.out.println(staff[i].toString());
                        System.out.println("Lương thực nhận: " + staff[i].calculateTotalSalary());
                        staff[i].checkPerformance();
                        System.out.println("----------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Nhập id cần sửa: ");
                    String updId = sc.nextLine();

                    for(int i = 0; i < size; i++){
                        if(staff[i].getId().equals(updId)){
                            System.out.print("Tên mới: ");
                            staff[i].setName(sc.nextLine());
                            System.out.print("Lương mới: ");
                            staff[i].setBaseSalary(Double.parseDouble(sc.nextLine()));
                            System.out.println("Cập nhật thành công.");
                        }
                    }
                    System.err.println("Không tìm thấy id!!!");
                    break;
                case 4:
                    System.out.print("Nhập id cần xóa: ");
                    String delId = sc.nextLine();

                    for(int i = 0; i < size; i++){
                        if(staff[i].getId().equals(delId)){
                            for(int j = i;  j < size - 1; j++){
                                staff[j+1] = staff[j];
                            }
                            size--;
                            System.out.println("Xóa thành công.");
                        }
                    }
                    System.err.println("Không tìm thấy id!!!");
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ");
            }
        } while (true);
    }
}
