import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        while (!str1.equals(str2)) {
            str1 = str1.substring(1) + str1.substring(0, 1);
            cnt++;
        }

        System.out.println(cnt);
    }
}