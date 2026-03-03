package HN_K24_CNTT4_PhamQuocLoc_003.Cau2;

import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        int maxTotal = arr[0] + arr[1];
        int firstNumber = arr[0];
        int secondNumber = arr[1];

        for (int i = 0;i < n - 1;i++){
            int currentTotal = arr[i] + arr[i + 1];
            if(currentTotal > maxTotal ){
                firstNumber = arr[i];
                secondNumber = arr[i +1];
            }
        }
        System.out.println("Cặp số liền kề có tổng lớn nhất: " + firstNumber + " và " + secondNumber + "(Tổng: " + maxTotal + ")" );
    }
}
