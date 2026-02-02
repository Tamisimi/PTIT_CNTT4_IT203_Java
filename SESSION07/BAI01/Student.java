
package SESSION07.BAI01;

public class Student {
    String maSV;
    String tenSV;

    static int totalStudent = 0;

    public Student(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Tên SV: " + tenSV);
        System.out.println("--------------------");
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }
}
