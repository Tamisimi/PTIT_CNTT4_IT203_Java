package SESSION02.BAI05;

import java.util.Scanner;

public class BAI05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");

        int diemUyTin = 100;
        int ngayTre;

        System.out.println();

        while (true) {
            System.out.print("So ngay tre cua lan nay: ");
            ngayTre = sc.nextInt();

            if (ngayTre == 999) {
                break;
            }

            if (ngayTre <= 0) {
                diemUyTin += 5;
                System.out.println("-> Tra tre " + ngayTre + " ngay: +5 diem.");
            } else {
                int truDiem = ngayTre * 2;
                diemUyTin -= truDiem;
                System.out.println("-> Tra tre " + ngayTre + " ngay: -" + truDiem + " diem.");
            }

            System.out.println();
        }

        System.out.println("Tong diem uy tin: " + diemUyTin);

        System.out.print("Xep loai: ");
        if (diemUyTin > 120) {
            System.out.println("DOC GIA THAN THIET");
        } else if (diemUyTin >= 80) {
            System.out.println("DOC GIA TIEU CHUAN");
        } else {
            System.out.println("DOC GIA CAN LUU Y");
        }

        sc.close();
    }
}