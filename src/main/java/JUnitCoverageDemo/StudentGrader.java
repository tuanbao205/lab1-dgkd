package JUnitCoverageDemo;

public class StudentGrader {

    public static String evaluateStudents(int[] scores) {
        int passed = 0;
        int failed = 0;

        for (int score : scores) {
            if (score >= 5) {
                passed++;
            } else {
                failed++;
            }
        }

        if (passed > failed) {
            return "Majority Passed";
        } else if (passed == failed) {
            return "Equal";
        } else {
            return "Majority Failed";
        }
    }

    public static void main(String[] args) {
        int[] scores = {8, 6, 4, 7, 3};

        String result = evaluateStudents(scores);

        System.out.println("Result: " + result);
    }
}