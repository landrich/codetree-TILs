import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[10];
        int len = 0;

        for (int i = 0; i < 10; i++) {
            strArr[i] = sc.next();
            len += strArr[i].length();
        }

        System.out.println(len);
    }
}