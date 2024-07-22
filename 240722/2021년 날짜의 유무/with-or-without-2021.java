import java.util.Scanner;

public class Main {
    public static int n1, n2;
    public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean cal(int m, int d) {
        if (m >= 1 && m <= 12) {
            if (days[m] >= d && 0 < d)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (cal(m, d)) 
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}