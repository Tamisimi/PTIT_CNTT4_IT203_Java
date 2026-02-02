package SESSION07.BAI06;

public class BAI06 {
    public static void main(String[] args) {

        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "abcdef");
        User u3 = new User(3, "dev_c", "999999");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(">> Đã thêm 3 user");
        System.out.println("Danh sách:");
        UserManager.displayUsers();

        System.out.println("\n>> Kiểm tra đăng nhập:");

        System.out.println("- Login (\"dev_a\", \"123456\"): "
                + (UserManager.checkLogin("dev_a", "123456") ? "Thành công" : "Thất bại"));

        System.out.println("- Login (\"dev_b\", \"sai_mk\"): "
                + (UserManager.checkLogin("dev_b", "sai_mk") ? "Thành công" : "Thất bại"));
    }
}
