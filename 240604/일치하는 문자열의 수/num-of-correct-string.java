import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            if(str.equals(word)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}