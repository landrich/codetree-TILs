import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[10];
        char ch;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            strArr[i] = sc.next();
        }

        ch = sc.next().charAt(0);

        for (int i = 0; i < 10; i++) {
            if (ch == strArr[i].charAt(strArr[i].length() - 1)) {
                System.out.println(strArr[i]);
                cnt++;
            }
        }

        if (cnt == 0) System.out.println("None");
    }
}