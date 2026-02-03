package SESSION07.BAI03;

public class Score {
    public static boolean checkPass(double score){
        return score >= 5.0;
    }
    public static double calculateAverage(double[] scores){
        double sum = 0;
        for(double s:scores){
            sum += s;
        }
        return sum/scores.length;
    }
}
