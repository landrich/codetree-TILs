import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) flag = true;
        }

        System.out.println(flag ? "C" : "N");
    }
}