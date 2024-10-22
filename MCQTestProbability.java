import java.util.Scanner;

public class MCQTestProbability {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int n = Scan.nextInt();
        int totalPos = 0, totalNeg = 0, totalZero = 0;
        for (int i = 1; i <= n; i++) {
            int cur = MCQTestProbability.run();
            totalPos += cur > 0 ? 1 : 0;
            totalNeg += cur < 0 ? 1 : 0;
            totalZero += cur == 0 ? 1 : 0;
        }
        System.out.println("Gain chance = " + (totalPos * 100.0 / n) + "%");
        System.out.println("Equal chance = " + (totalZero * 100.0 / n) + "%");
        System.out.println("Loss chance = " + (totalNeg * 100.0 / n) + "%");
    }

    static int run() {
        int count = 0;
        int questionsAttempted = 4;
        for (int i = 0; i < questionsAttempted; i++) {
            if ((int) (Math.random() * 4) == (int) (Math.random() * 4)) {
                count++;
            }
        }
        int gain = count * 4 - (questionsAttempted - count);
        return gain > 0 ? 1 : (gain < 0 ? -1 : 0);
    }
}
