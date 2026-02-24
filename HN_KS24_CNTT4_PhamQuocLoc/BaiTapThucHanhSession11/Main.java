package HN_KS24_CNTT4_PhamQuocLoc.BaiTapThucHanhSession11;

public class Main {
    public static void main(String[] args){
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("1", "Bạc sỉu",30000,true);
        drinks[1] = new FruitJuice("2","Nước cam",40000,10);
        drinks[2] = null;

        System.out.println("HÓA ĐƠN ĐỒ UỐNG");

        for(int i = 0; i < drinks.length;i++){
            if(drinks[i] != null){
                System.out.println("\nĐồ uống thứ" + (i + 1) + ":");
                drinks[i].displayInfo();

                double total = drinks[i].calculatePrice();
                System.out.printf("Thành tiền: %.0f VNĐ\n", total);

                if (drinks[i] instanceof Mixable) {
                    ((Mixable) drinks[i]).mix();
                }
            }
        }
    }
}
