package HN_KS24_CNTT4_PhamQuocLoc.BaiTapThucHanhSession11;

public class FruitJuice extends Drink implements Mixable {
    private int discount;

    public FruitJuice(String id, String name,double price,int discount){
        super(id,name,price);
        this.discount = discount;
    }

    @Override
    public double calculatePrice(){
        return price - (price * discount / 100.0);
    }

    @Override
    public void mix(){
        System.out.println("Đang ép trái cây...");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Giảm giá" + discount + "%");
    }
}
