import java.util.Scanner;

public class Main {
    public static boolean find369(int n) {
        String temp = Integer.toString(n);
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '3' || temp.charAt(i) == '6' || temp.charAt(i) == '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean findNum(int n) {
        if (n % 3 == 0 || find369(n)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        for (int i = n; i <= m; i++) {
            if (findNum(i)) {
                result++;
            }
        }

        System.out.println(result);
    }
}