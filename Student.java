package HWClass14;

public class Student {public static void main(String[] args) {
    int score = 99;
    System.out.println(getGrade(score));
}

    public static String getGrade(int score) {
        if (score > 90) {
            return "A";
        } else if (score > 80) {
            return "B";
        } else if (score > 70) {
            return "C";
        } else if (score > 50) {
            return "D";
        } else {
            return "F";
        }
    }

}
