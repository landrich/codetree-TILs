import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scoreArr = new int[n];
        int sum, cnt = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                scoreArr[i] = sc.nextInt();
                sum += scoreArr[i];
            }
            if (sum / 4 >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}