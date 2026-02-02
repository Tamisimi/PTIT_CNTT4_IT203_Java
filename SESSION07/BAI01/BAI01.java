package SESSION07.BAI01;

public class BAI01 {
    public static void main(String[] args) {

        Student s1 = new Student("SV001", "Văn nguyên A");
        Student s2 = new Student("SV002", "Nguyễn Thị B");
        Student s3 = new Student("SV003", "Lê Bá C");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.displayTotalStudent();
    }
}
