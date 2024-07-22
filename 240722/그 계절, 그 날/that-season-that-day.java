import java.util.Scanner;

public class Main {
    public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] leapDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeap(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean cal(int y, int m, int d) {
        if (isLeap(y)) {
            if (m >= 1 && m <= 12) {
                if (leapDays[m] >= d && 0 < d)
                    return true;
                else
                    return false;
            } else {
                return false;
            }
        } else {
            if (m >= 1 && m <= 12) {
                if (days[m] >= d && 0 < d)
                    return true;
                else
                    return false;
            } else {
                return false;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (cal(y, m, d)) {
            if (m >= 3 && m <= 5) {
                System.out.println("Spring");
            }
            else if (m >= 3 && m <= 5) {
                System.out.println("Summer");
            }
            else if (m >= 3 && m <= 5) {
                System.out.println("Fall");
            } else {
                System.out.println("Winter");
            }
        } else {
            System.out.println(-1);
        }
    }
}