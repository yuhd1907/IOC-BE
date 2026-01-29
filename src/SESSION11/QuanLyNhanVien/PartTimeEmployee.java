package SESSION11.QuanLyNhanVien;

public class PartTimeEmployee extends Employee implements BonusEligible{
    private double workingHours;
    static final double hourlyRate = 25000;

    public PartTimeEmployee(int id, String name, double workingHours) {
        super(id, name);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate * 1.1;
    }

    @Override
    public double calculateBonus() {
        return workingHours * hourlyRate * 0.1;
    }
}
