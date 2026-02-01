package SESSION06.BAI02;

public class BAI02 {
    private String username;
    private String password;
    private String email;

    public BAI02(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void doiMatKhau(String matKhauMoi) {
        this.password = matKhauMoi;
        System.out.println("Đổi mật khẩu thành công!");
    }

    public void hienThiThongTin() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        BAI02 acc = new SS06_02(
                "phamloc",
                "123456",
                "phamloc@gmail.com"
        );

        acc.hienThiThongTin();

        acc.doiMatKhau("newpassword2026");

        acc.hienThiThongTin();
    }
}
