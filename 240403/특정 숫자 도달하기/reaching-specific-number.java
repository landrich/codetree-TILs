import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0, cnt = 0;
        
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (num[i] >= 250) {
                break;
            }
            sum += num[i];
            cnt++;
        }

        System.out.printf("%d %.1f", sum, (double) sum / cnt);
    }
}