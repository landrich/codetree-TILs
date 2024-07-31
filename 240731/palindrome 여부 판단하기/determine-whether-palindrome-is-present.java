import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String str) {
        boolean flag = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}