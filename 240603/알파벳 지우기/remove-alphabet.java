import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String result1 = "";
        String result2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                result1 += str1.charAt(i);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                result2 += str2.charAt(i);
            }
        }

        System.out.println(Integer.parseInt(result1) + Integer.parseInt(result2));
    }
}