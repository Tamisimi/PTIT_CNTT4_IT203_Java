package HN_KS24_CNTT4_PhamQuocLoc.BaiTapThucHanhSession15;

public abstract class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo(){
        System.out.printf("Mã: %s | Tên: %s | Giá: %.0f", id, name, price);
    }

    public String getId(){
        return id;
    }
}
