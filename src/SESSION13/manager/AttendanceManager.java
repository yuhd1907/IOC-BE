package SESSION13.manager;

import SESSION13.model.AttendanceStudent;

import java.util.ArrayList;

public class AttendanceManager implements Manage<AttendanceStudent> {
    private ArrayList<AttendanceStudent> students;

    public AttendanceManager() {
        students = new ArrayList<>();
        students.add(new AttendanceStudent("01", "Nguyen Cong Huong"));
    }

    @Override
    public void add(AttendanceStudent item) {
        students.add(item);
    }

    @Override
    public void update(int index, AttendanceStudent item) {
        if (index >= 0 && index < students.size()) {
            students.set(index, item);
        } else {
            System.err.println("Không tồn tại sinh viên!");
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        } else {
            System.err.println("Không tồn tại sinh viên!");
        }
    }

    @Override
    public void display() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            System.out.println("+------------+---------------------------+");
            System.out.printf("| %-10s | %-25s |\n", "ID", "Tên sinh viên");
            System.out.println("+------------+---------------------------+");
            for (AttendanceStudent student : students) {
                student.displayData();
            }
        }
    }

    public int findIndexById(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
