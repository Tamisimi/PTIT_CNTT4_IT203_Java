package SESSION06.BAI06;

public class BAI06 {
    private int id;
    private String username;
    private String password;
    private String email;

    public BAI06(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password không được rỗng!");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }

    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        BAI06 u1 = new BAI06(1, "locngu", "123456", "locngu@gmail.com");
        u1.hienThiThongTin();

        BAI06 u2 = new BAI06(2, "user2", "abcdef", "email-sai");
        u2.hienThiThongTin();

        BAI06 u3 = new BAI06(3, "user3", "", "user3@gmail.com");
        u3.hienThiThongTin();

        u2.setEmail("user2@gmail.com");
        u3.setPassword("newpass123");

        u2.hienThiThongTin();
        u3.hienThiThongTin();
    }
}
