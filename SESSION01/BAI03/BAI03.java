package SESSION01.BAI03;
import java.util.Scanner;
public class BAI03 {
    public static void main(String[] args) {

        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Trước hoán đổi:");
        System.out.println("Book1 = " + book1 + ", Book2 = " + book2);

        String temp = book1;

        book1 = book2;
        book2 = temp;

        System.out.println("\nSau hoán đổi:");
        System.out.println("Book1 = " + book1 + ", Book2 = " + book2);
    }
}
