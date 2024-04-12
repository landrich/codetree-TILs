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
                flag = true;
                for (int j = 0; j < n2; j++) {
                    if (n2Arr[j] != n1Arr[j + i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) break;
            }
        }

        System.out.println(flag ? "Yes" : "No");
    }
}