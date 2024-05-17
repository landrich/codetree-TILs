import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int max, min;

        if (len1 > len2) {
            max = len1 > len3 ? len1 : len3;
        } else {
            max = len2 > len3 ? len2 : len3;
        }

        if (len1 < len2) {
            min = len1 < len3 ? len1 : len3;
        } else {
            min = len2 < len3 ? len2 : len3;
        }

        System.out.println(max - min);
    }
}