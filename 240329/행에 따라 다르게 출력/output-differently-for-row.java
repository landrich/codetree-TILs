import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 1)
                    cnt += 2;
                else
                    ++cnt;
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}