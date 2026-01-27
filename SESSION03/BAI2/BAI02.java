package SESSION03.BAI2;

import java.util.Scanner;

public class BAI02 {

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] books = {
                "Doraemon",
                "Harry Potter",
                "Sherlock Holmes",
                "One Piece",
                "Clean Code"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int index = searchBooks(books, search);

        if (index != -1) {
            System.out.println("Tìm thấy sách '" + search + "' tại vị trí số: " + index);
        } else {
            System.out.println("Sách không tồn tại trong thư viện.");
        }
    }
}
