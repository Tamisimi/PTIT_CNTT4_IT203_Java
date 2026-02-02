package SESSION07.BAI02;

public class BAI02 {
    static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a); 
        System.out.println("b = " + b); 

        System.out.println("----------------------");

        Student s1 = new Student("Nguyễn Văn A");
        Student s2 = s1;

        s2.name = "Trần Văn B";

        System.out.println("Reference:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
