package SESSION02.BAI03;

import java.util.Scanner;

public class BAI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();

        int total = 0;
        final int PHAT_MOI_NGAY = 5000;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            int ngayTre = sc.nextInt();

            total += ngayTre * PHAT_MOI_NGAY;
        }

        System.out.println();

        System.out.println("===> Tong tien phat: " + total + " VND");

        sc.close();
    }
}