package HN_KS24_CNTT4_PhamQuocLoc;

import java.util.Scanner;

public class MSSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ds = new String[100];
        int soLuong = 0;

        int chosee;

        do {
            System.out.println("== QUẢN LÝ SINH VIÊN ==");
            System.out.println("1.Hiển thị danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Sửa");
            System.out.println("4.Xóa");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Thoát");

            chosee = sc.nextInt();
            switch (chosee) {
                case 1:
                    if (soLuong == 0) {
                        System.out.println("Danh sách hiện tại đang rông");
                    } else {
                        System.out.println("Danh sách mã sv");
                        for (int i = 0; i < soLuong; i++) {
                            System.out.println((i + 1) + "." + ds[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập mã sinh viên");
                    String mssv = sc.nextLine().toUpperCase();
                    if (checkValid(mssv)) {
                        ds[soLuong] = mssv;
                        soLuong++;
                        System.out.println("Đã thêm thành công");
                    } else {
                        System.out.println("Sai định dạng");
                    }
                    break;
                case 3:
                    if (soLuong == 0) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        System.out.print("Nhập số muốn sửa từ 1 đến " + soLuong +": ");
                        int viTri = sc.nextInt();
                        sc.nextLine();

                        if (viTri >= 1 && viTri <= soLuong) {
                            System.out.print("Nhập MSSV mới: ");
                            String mssvMoi = sc.nextLine().toUpperCase();

                            if (checkValid(mssvMoi)) {
                                ds[viTri - 1] = mssvMoi;
                                System.out.println("Sửa thành công");
                            } else {
                                System.out.println("Sai định dạng");
                            }
                        } else {
                            System.out.println("Số không hợp lệ");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhap MSSV can xoa: ");
                    String canXoa = sc.nextLine().toUpperCase();

                    int viTri = -1;
                    for (int i = 0; i < soLuong; i++) {
                        if (ds[i].equals(canXoa)) {
                            viTri = i;
                            break;
                        }
                    }

                    if (viTri == -1) {
                        System.out.println("Khong tim thay MSSV nay!");
                    } else {
                        for (int i = viTri; i < soLuong - 1; i++) {
                            ds[i] = ds[i + 1];
                        }
                        soLuong--;
                        System.out.println("Da xoa thanh cong!");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Chọn từ 1 đến 6");
            }
        }while (chosee != 6) ;
    }

    public static boolean checkValid(String mssv) {
        if (mssv.length() != 8){
            return false;
        }
        if(mssv.charAt(0) != 'B'){
            return false;
        }
        for (int i = 1;i < 8;i++){
            if (!Character.isDigit(mssv.charAt(i))){
                return false;
            }
        }
        return true;
    }
}