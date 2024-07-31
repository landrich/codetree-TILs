import java.util.Scanner;

public class Main {
    public static int calc(int n, int m) {
        if (n > m) {
            return n + 25;
        } else {
            return n * 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;

        temp = calc(a, b);
        b = calc(b, a);
        a = temp;

        System.out.print(a + " " + b);
    }
}