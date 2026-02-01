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
        SS06_04 nv1 = new SS06_04();
        SS06_04 nv2 = new SS06_04("NV01", "Nguyễn Văn A");
        SS06_04 nv3 = new SS06_04("NV02", "Trần Thị B", 15000000);

        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
    }
}
