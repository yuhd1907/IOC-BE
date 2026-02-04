package SESSION13.manager;

import SESSION13.model.Person;

import java.util.ArrayList;

public class UserManager implements Manage<Person> {
    private ArrayList<Person> users;

    public UserManager() {
        users = new ArrayList<>();
        users.add(new Person("Nguyen Cong Huong", "huongcaohag@gmail.com", "0367501235"));
    }

    @Override
    public void add(Person item) {
        users.add(item);
    }

    @Override
    public void update(int index, Person item) {
        if (index >= 0 && index < users.size()) {
            users.set(index, item);
        } else {
            System.err.println("Không tồn tại người dùng!");
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
        } else {
            System.err.println("Không tồn tại người dùng!");
        }
    }

    @Override
    public void display() {
        if (users.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            System.out.println("+---------------------------+---------------------------+-----------------+");
            System.out.printf("| %-25s | %-25s | %-15s |\n", "Tên người dùng", "Email", "Số điện thoại");
            System.out.println("+---------------------------+---------------------------+-----------------+");
            for (Person person : users) {
                person.displayData();
            }
        }
    }

    public int findIndexByEmail(String email) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)) {
                return i;
            }
        }
        return -1;
    }
}
