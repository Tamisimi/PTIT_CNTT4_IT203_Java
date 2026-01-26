package SESSION01.BAI04;
import java.util.Scanner;
public class BAI04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double usdPrice = sc.nextDouble();

        System.out.print("Nhập tỷ giá (VNĐ/USD - kiểu float): ");
        float rate = sc.nextFloat();

        double exactVND = usdPrice * rate;

        long roundedVND = (long) exactVND;

        System.out.println("Giá chính xác (số thực): " + exactVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);

        sc.close();
    }
}
