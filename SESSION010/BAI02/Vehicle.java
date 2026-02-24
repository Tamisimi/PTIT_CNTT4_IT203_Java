package SESSION10.BAI02;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void move();
}
