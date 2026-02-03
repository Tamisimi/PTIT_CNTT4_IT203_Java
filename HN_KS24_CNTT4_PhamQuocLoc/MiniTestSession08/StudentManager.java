package HN_KS24_CNTT4_PhamQuocLoc.MiniTestSession08;

import java.util.Scanner;

public class StudentManager {

    // Inner class Student
    private static class Student {
        private String mssv;

        public Student(String mssv) {
            this.mssv = mssv;
        }

        public String getMssv() {
            return mssv;
        }

        public void setMssv(String mssv) {
            this.mssv = mssv;
        }

        public String toString() {
            return mssv;
        }
    }

    private Student[] students = new Student[100];
    private int count = 0;
    private final String regex = "^B\\d{7}$";
    private Scanner sc;

    public StudentManager(Scanner sc) {
        this.sc = sc;
    }

    public void hienThiDanhSach() {
        if (count == 0) {
            System.out.println("Danh sách trống");
            return;
        }
        System.out.println("\nDanh sách MSSV:");
        for (int i = 0; i < count; i++) {
            System.out.println(i + ": " + students[i]);
        }
    }

    public void themMoi() {
        String ma;
        do {
            System.out.print("Nhập MSSV (B + 7 so):");
            ma = sc.nextLine().toUpperCase().trim();
            if (!ma.matches(regex)) {
                System.out.println("Sai định dạng MSSV phải bắt đầu bằng B và 7 chữ số");
            }
        } while (!ma.matches(regex));

        students[count] = new Student(ma);
        count++;
        System.out.println("Thêm thành công");
    }

    public void capNhat() {
        if (count == 0) {
            System.out.println("Danh sách trống");
            return;
        }

        hienThiDanhSach();
        System.out.print("Nhập vị trí cần sửa");
        int pos = sc.nextInt();
        sc.nextLine();

        if (pos < 0 || pos >= count) {
            System.out.println("Vị trí không hợp lệ");
            return;
        }

        String maMoi;
        do {
            System.out.print("Nhập MSSV mới: ");
            maMoi = sc.nextLine().toUpperCase().trim();
            if (!maMoi.matches(regex)) {
                System.out.println("Sai định dạng");
            }
        } while (!maMoi.matches(regex));

        students[pos].setMssv(maMoi);
        System.out.println("Đã cập nhập");
    }

    public void xoa() {
        if (count == 0) {
            System.out.println("Danh sách trống");
            return;
        }

        hienThiDanhSach();
        System.out.print("Nhập MSSV cần xoá: ");
        String xoa = sc.nextLine().toUpperCase().trim();

        for (int i = 0; i < count; i++) {
            if (students[i].getMssv().equals(xoa)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Đã xóa thành công ");
                return;
            }
        }
        System.out.println("Không tìm thấy MSSV");
    }
}