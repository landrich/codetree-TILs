import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        int cnt = 0;
        String numStr = Integer.toString(sum);

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '1') cnt++;
        }

        System.out.println(cnt);
    }
}