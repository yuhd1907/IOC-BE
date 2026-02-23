package SESSION15.QuanLyMonHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SubjectManager<T extends Subject> {

    private List<T> subjectList = new ArrayList<>();

    public void addSubject(T subject) {
        subjectList.add(subject);
    }

    public boolean deleteByCode(String code) {
        return subjectList.removeIf(s -> s.getCode().equalsIgnoreCase(code));
    }

    public void displayAll() {
        if (subjectList.isEmpty()) {
            System.out.println("Danh sách môn học trống.");
            return;
        }
        subjectList.forEach(System.out::println);
    }

    // Stream + Optional
    public Optional<T> findByName(String name) {
        return subjectList.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<T> filterByCreditsGreaterThan(int minCredits) {
        return subjectList.stream()
                .filter(s -> s.getCredits() > minCredits)
                .toList();
    }
}
