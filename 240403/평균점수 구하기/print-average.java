import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scoreArr = new double[8];
        double sum = 0;
        
        for (int i = 0; i < 8; i++) {
            scoreArr[i] = sc.nextDouble();
            sum += scoreArr[i];
        }

        System.out.printf("%.1f\n", sum / 8);
    }
}