package SESSION06.BAI03;

public class BAI03 {
    private String maSP;
    private String tenSP;
    private double giaBan;

    public BAI03(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan); 
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Giá bán không hợp lệ! Giá phải > 0");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        BAI03 p = new BAI03("SP01", "Bàn phím cơ", 1500000);

        p.hienThiThongTin();

        p.setGiaBan(-500000);

        p.hienThiThongTin();

        p.setGiaBan(1300000);
        p.hienThiThongTin();
    }
}
