package SESSION11.QuanLyNhanVien;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee(1, "An", 10000000);
        employees[1] = new PartTimeEmployee(2, "Binh", 80);

        for (Employee e : employees) {
            e.showInfo();
            System.out.println("Lương: " + e.calculateSalary());

            if (e instanceof BonusEligible) {
                System.out.println("Thưởng: " +
                        ((BonusEligible) e).calculateBonus());
            }
        }
    }
}
