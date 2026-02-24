package SESSION09.BAI05;

public class Production extends Employee{
    private int products;
    private double salaryPerProduct;

    public Production(String name, int products, double salaryPerProduct) {
        super(name);
        this.products = products;
        this.salaryPerProduct = salaryPerProduct;
    }

    @Override
    public double calculateSalary() {
        return products * salaryPerProduct;
    }
}
