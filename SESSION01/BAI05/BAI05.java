package SESSION01.BAI05;
import java.util.Scanner;
public class BAI05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        int thousands = code / 1000;
        int hundreds  = (code / 100) % 10;
        int dozens    = (code / 10) % 10;
        int units     = code % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        int expectedCheckDigit = sumOfFirstThreeNumber % 10;

        boolean isValid = expectedCheckDigit == units;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + expectedCheckDigit);

        if (isValid) {
            System.out.println("Kết quả kiểm tra: OK");
        } else {
            System.out.println("Kết quả kiểm tra: Error");
        }

        sc.close();
    }
}
