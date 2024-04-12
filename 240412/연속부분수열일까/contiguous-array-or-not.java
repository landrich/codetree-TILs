import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] n1Arr = new int[n1];
        int[] n2Arr = new int[n2];
        int chkIndex = 0;
        boolean flag = true;

        for (int i = 0; i < n1; i++) {
            n1Arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            n2Arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            if (n1Arr[i] == n2Arr[0]) {
                chkIndex = i;
                break;
            }
        }

        for (int i = 0; i < n2; i++) {
            if (n2Arr[i] != n1Arr[i + chkIndex]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Yes" : "No");
    }
}