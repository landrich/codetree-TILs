import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int q;
        String temp;

        for (int i = 0; i < n; i++) {
            q = sc.nextInt();
            if (q == 1) {
                str = str.substring(1, str.length()) + str.substring(0, 1);
            } else if (q == 2) {
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
            } else {
                temp = "";
                for (int j = str.length() - 1; j >= 0; j--) {
                    temp += str.charAt(j);
                }
                str = temp;
            }
            System.out.println(str);
        }
    }
}