package SESSION02.BAI01;

import java.util.Scanner;

public class BAI01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhap so sach dang muon: ");
        int soSach = sc.nextInt();

        System.out.println();

        if (tuoi >= 18 && soSach < 3) {
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem.");
        } else {
            System.out.println("Ket qua: Khong du dieu kien.");
            System.out.println("- Ly do:");

            if (tuoi < 18) {
                System.out.println("  Ban phai tu 18 tuoi tro len.");
            }

            if (soSach >= 3) {
                System.out.println("  Ban da muon toi da 3 cuon.");
            }
        }

        sc.close();
    }
}