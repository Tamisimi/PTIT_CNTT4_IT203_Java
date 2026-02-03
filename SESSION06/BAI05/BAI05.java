package SESSION06.BAI05;

public class BAI05 {
    private String maSach;
    private String tenSach;
    private double gia;

    public BAI05(String maSach, String tenSach, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + this.maSach);
        System.out.println("Tên sách: " + this.tenSach);
        System.out.println("Giá: " + this.gia);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        BAI05 b1 = new BAI05("S01", "Lập trình Java cơ bản", 120000);
        BAI05 b2 = new BAI05("S02", "OOP từ A đến Z", 150000);

        b1.hienThiThongTin();
        b2.hienThiThongTin();
    }
}
