package SESSION02.BAI06;

import java.util.Scanner;

public class BAI06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ngayTrongTuan = {"Thu 2", "Thu 3", "Thu 4", "Thu 5", "Thu 6", "Thu 7", "Chu Nhat"};

        int maxLuotMuon = Integer.MIN_VALUE;
        int minLuotMuon = Integer.MAX_VALUE;
        int tongLuotMuon = 0;
        int soNgayMoCua = 0;

        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap luot muon ngay " + ngayTrongTuan[i] + ": ");
            int luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue;
            }

            // Cập nhật max và min
            if (luotMuon > maxLuotMuon) {
                maxLuotMuon = luotMuon;
            }
            if (luotMuon < minLuotMuon) {
                minLuotMuon = luotMuon;
            }

            // Tích lũy tổng và đếm số ngày hợp lệ
            tongLuotMuon += luotMuon;
            soNgayMoCua++;
        }

        System.out.println();
        System.out.println("--- KET QUA THONG KE ---");

        if (soNgayMoCua == 0) {
            System.out.println("Khong co ngay nao thu vien mo cua trong tuan.");
        } else {
            System.out.println("Luot muon cao nhat: " + maxLuotMuon);
            System.out.println("Luot muon thap nhat: " + minLuotMuon);

            double trungBinh = (double) tongLuotMuon / soNgayMoCua;
            System.out.printf("Trung binh luot muon/ngay: %.1f%n", trungBinh);
        }

        sc.close();
    }
}