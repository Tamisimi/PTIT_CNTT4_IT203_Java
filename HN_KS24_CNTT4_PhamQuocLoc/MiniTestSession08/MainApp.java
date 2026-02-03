package HN_KS24_CNTT4_PhamQuocLoc.MiniTestSession08;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(sc);
        int choose;

        do {
            System.out.println("\n=== QUAN LY MSSV ===");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choose = sc.nextInt();

            switch (choose){
                case 1:{
                    manager.hienThiDanhSach();
                    break;
                }
                case 2:{
                    manager.themMoi();
                    break;
                }
                case 3:{
                    manager.capNhat();
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    System.out.println("Thoát chương trình");
                    break;
                }
                default:{
                    System.out.println("Chọn lại từ 1 đến 6");
                }
            }
        }while (choose != 6);
    }

}
