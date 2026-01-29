package SESSION05.MiniProject;

import java.util.HashMap;
import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 6) {
            System.out.println("------MENU------");
            System.out.println("1. Tim cap so co tong bang K (Two Sum)");
            System.out.println("2. Don so 0 ve cuoi (Move Zeroes)");
            System.out.println("3. Kiem tra chuoi doi xung (Valid Palindrome)");
            System.out.println("4. Dao nguoc tu trong cau (Reverse Words)");
            System.out.println("5. So hanh phuc (Happy Number)");
            System.out.println("6. Thoat chuong trinh");
            System.out.printf("Lua chon cua ban: ");

            // Xử lý lỗi nhập không phải số
            while (!sc.hasNextInt()) {
                System.out.println("Vui long nhap so nguyen!");
                sc.next(); // bỏ input lỗi
                System.out.printf("Lua chon cua ban: ");
            }
            choice = sc.nextInt();
            sc.nextLine(); // xóa dòng mới còn sót

            System.out.println("-----------------------------------");

            switch (choice) {
                case 1:
                    timCapTongBangK(sc);
                    break;
                case 2:
                    donSo0VeCuoi(sc);
                    break;
                case 3:
                    kiemTraChuoiDoiXung(sc);
                    break;
                case 4:
                    daoNguocCacTu(sc);
                    break;
                case 5:
                    kiemTraSoHanhPhuc(sc);
                    break;
                case 6:
                    System.out.println("Tam biet! Hen gap lai.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!!");
            }
            System.out.println();
        }
        sc.close();
    }

    // 1. Tìm cặp số có tổng bằng K
    static void timCapTongBangK(Scanner sc) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhap gia tri K (target): ");
        int k = sc.nextInt();

        int[] result = timHaiChiSo(arr, k);

        if (result[0] == -1) {
            System.out.println("Khong tim thay cap nao co tong bang " + k);
        } else {
            System.out.printf("Tim thay: arr[%d] = %d va arr[%d] = %d  -->  %d + %d = %d%n",
                    result[0], arr[result[0]], result[1], arr[result[1]], arr[result[0]], arr[result[1]], k);
        }
    }

    static int[] timHaiChiSo(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    // 2. Dồn số 0 về cuối
    static void donSo0VeCuoi(Scanner sc) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Mang ban dau: ");
        inMang(arr);

        // Dồn 0 về cuối (in-place)
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // hoán đổi
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }
        }

        System.out.print("Mang sau khi don 0 ve cuoi: ");
        inMang(arr);
    }

    // 3. Kiểm tra chuỗi đối xứng (bỏ ký tự đặc biệt, không phân biệt hoa thường)
    static void kiemTraChuoiDoiXung(Scanner sc) {
        System.out.print("Nhap chuoi can kiem tra: ");
        String s = sc.nextLine();

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean laDoiXung = true;
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                laDoiXung = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Chuoi sau khi lam sach: " + cleaned);
        System.out.println(laDoiXung ? "LA chuoi doi xung" : "KHONG phai chuoi doi xung");
    }

    // 4. Đảo ngược thứ tự các từ
    static void daoNguocCacTu(Scanner sc) {
        System.out.print("Nhap cau (co the co nhieu khoang trang): ");
        String s = sc.nextLine();

        // tách từ, loại bỏ khoảng trắng thừa
        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }

        System.out.println("Ket qua sau khi dao nguoc tu: ");
        System.out.println("\"" + result + "\"");
    }

    // 5. Kiểm tra số hạnh phúc
    static void kiemTraSoHanhPhuc(Scanner sc) {
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();

        boolean laHanhPhuc = laSoHanhPhuc(n);

        System.out.println(n + (laHanhPhuc ? " LA so hanh phuc" : " KHONG phai so hanh phuc"));
    }

    static boolean laSoHanhPhuc(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = tongBinhPhuongCacChuSo(slow);
            fast = tongBinhPhuongCacChuSo(tongBinhPhuongCacChuSo(fast));

            if (slow == 1) return true;
        } while (slow != fast);

        return false;
    }

    static int tongBinhPhuongCacChuSo(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // Hàm hỗ trợ in mảng
    static void inMang(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
