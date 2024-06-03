import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            sum += num;
        }

        String str = Integer.toString(sum);

        System.out.println(str.substring(1) + str.substring(0, 1));
    }
}