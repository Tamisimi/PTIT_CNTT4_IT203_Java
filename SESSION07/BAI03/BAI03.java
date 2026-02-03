package SESSION07.BAI03;

public class BAI03 {
    public static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5\n");

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.println(">> Kết quả:");
        System.out.printf("- Điểm trung bình của cả lớp: %.2f\n", avg);

        for (double score : scores) {
            if (ScoreUtils.checkPass(score)) {
                System.out.println("- Điểm " + score + ": Đỗ");
            } else {
                System.out.println("- Điểm " + score + ": Trượt");
            }
        }
    }
}
