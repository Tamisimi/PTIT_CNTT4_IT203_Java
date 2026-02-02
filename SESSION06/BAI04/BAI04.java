package SESSION06.HW04;

public class BAI04 {
    private String maNV;
    private String tenNV;
    private double luong;

    public BAI04() {
        this.maNV = "Chưa có";
        this.tenNV = "Chưa có";
        this.luong = 0;
    }

    public BAI04(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }

    public BAI04(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.println("Lương: " + luong);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        BAI04 nv1 = new BAI04();
        BAI04 nv2 = new BAI04("NV01", "Nguyễn Văn A");
        BAI04 nv3 = new BAI04("NV02", "Trần Thị B", 15000000);

        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
    }
}
