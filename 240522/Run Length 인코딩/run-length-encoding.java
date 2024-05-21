import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;
        char lastChar = str.charAt(0);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (lastChar == str.charAt(i)) {
                cnt++;
            } else {
                result += lastChar;
                result += cnt;
                cnt = 1;
                lastChar = str.charAt(i);
            }

            if (i == str.length() - 1) {
                result += lastChar;
                result += cnt;
            }
        }

        System.out.println(result.length());
        System.out.println(result);
    }
}