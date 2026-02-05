package SESSION09.BAI05;

public class Office extends Employee{
    private double baseSalary;
    public Office(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
