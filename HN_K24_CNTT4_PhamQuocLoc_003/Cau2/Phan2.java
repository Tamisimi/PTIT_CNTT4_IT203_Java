package HN_K24_CNTT4_PhamQuocLoc_003.Cau2;

import java.util.Scanner;

public class Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n -1;i++){
            for(int j = i + 1;j < n;j++){
                boolean needToChange = false;
                if(arr[i] % 2 == 0 && arr[j] % 2 !=0){
                    needToChange = true;
                }else if(arr[i] % 2 != 0 && arr[j] % 2 == 0){
                    if(arr[i] < arr[j]){
                        needToChange = true;
                    }
                }
                if(needToChange){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
