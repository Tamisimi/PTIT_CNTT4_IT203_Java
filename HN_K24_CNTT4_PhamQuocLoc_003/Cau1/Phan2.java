package HN_K24_CNTT4_PhamQuocLoc_003.Cau1;

import java.util.Scanner;

public class Phan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = sc.nextLine();
        fullName = fullName.toLowerCase().trim();

        String[] word = fullName.split(" ");
        String name = "";
        String firstLetter = "";
        for(int i = 0;i < word.length;i++){
            if(!word[i].isEmpty()){
                if(i == word.length - 1){
                    name = word[i];
                }else {
                    firstLetter += word[i].charAt(0);
                }
            }
        }
        String email = name + firstLetter + "@rikkei.edu.com";
        System.out.println("Email: " + email);
    }
}
