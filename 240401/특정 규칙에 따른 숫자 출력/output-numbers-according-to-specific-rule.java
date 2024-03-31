import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = n; i > 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                if (cnt == 10) cnt = 1;
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }
}