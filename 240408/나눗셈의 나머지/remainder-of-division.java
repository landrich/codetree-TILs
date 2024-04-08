import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] mod = new int[10];
        int sum = 0;

        while (a > 1) {
            mod[a % b]++;
            a /= b;
        }

        for (int i = 0; i < 10; i++) {
            sum += mod[i] * mod[i];
        }

        System.out.println(sum);
    }
}