package SESSION06.BAI01;

public class BAI01 {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    public BAI01(String maSV, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        SS06_01 sv1 = new SS06_01("SV001", "Nguyễn Văn A", 2004, 8.2);
        SS06_01 sv2 = new SS06_01("SV002", "Trần Thị B", 2003, 7.6);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
