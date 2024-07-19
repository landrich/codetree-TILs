import java.util.Scanner;

public class Main {
    public static int power(int n, int m) {
        int sum = 1;
        for (int i = 0; i < m; i++) {
            sum *= n;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }
}