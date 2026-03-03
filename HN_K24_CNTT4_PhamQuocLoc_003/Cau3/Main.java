package HN_K24_CNTT4_PhamQuocLoc_003.Cau3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0;i > n;i++){
            if(arr[i] > 100){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Không có phần tử hợp lệ");
        }
    }
}
