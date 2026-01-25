package SESSION01.BAI06;
import java.util.Scanner;
public class BAI06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự của sách: ");
        int stt = sc.nextInt();

        int shelf = (stt - 1) / 25 + 1;

        int position = (stt - 1) % 25 + 1;

        String area = (shelf <= 10) ? "Khu Cận" : "Khu Viễn";

        System.out.println("\n--- Tra cứu ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelf + " - Vị trí " + position);
        System.out.println("Phân khu: " + area);

        sc.close();
    }
}
