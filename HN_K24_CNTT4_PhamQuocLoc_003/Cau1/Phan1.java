package HN_K24_CNTT4_PhamQuocLoc_003.Cau1;

import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        int letter = 0, number = 0, otherLetter = 0;
        for (int i = 0;i< s.length();i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                letter++;
            } else if (c >= '0' && c <= '9') {
                number++;
            }else{
                otherLetter++;
            }
        }

        int max = letter;
        if(number > max){
            max = number;
        }
        if(otherLetter > max){
            max = otherLetter;
        }
        System.out.println(max);
    }
}
