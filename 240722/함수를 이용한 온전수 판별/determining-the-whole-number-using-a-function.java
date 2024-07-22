import java.util.Scanner;

public class Main {
    public static int calc(int a, int b) {
        int cnt = 0;
    
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0 && i % 10 != 5) {
                if (i % 3 != 0) {
                    cnt++;
                } else if (i % 9 == 0) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calc(a, b));
    }
}