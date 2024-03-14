import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int classCnt = 0, hallCnt = 0, bathCnt = 0;

        for (int i = n; i >= 2; i--) {
            if (i % 12 == 0) {
                bathCnt++;
            } else if (i % 3 == 0) {
                hallCnt++;
            } else if (i % 2 == 0) {
                classCnt++;
            }
        }

        System.out.print(classCnt + " " + hallCnt + " " + bathCnt);
        
    }
}