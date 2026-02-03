package SESSION07.BAI04;

public class BAI04 {
    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Phạm Quốc A");
        ClassRoom sv2 = new ClassRoom("Trần Ngọc B");
        ClassRoom sv3 = new ClassRoom("Nguyễn Tuấn C");

        sv1.contribute(100_000);
        sv2.contribute(150_000);
        sv3.contribute(200_000);

        ClassRoom.showClassFund();
    }
}
