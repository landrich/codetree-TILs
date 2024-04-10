import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] numArr = new int[n];
        int[] query = new int[3];
        int q2Index = -1;

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            query[0] = sc.nextInt();
            if (query[0] == 1) {
                query[1] = sc.nextInt();
                System.out.println(numArr[query[1] - 1]);
            } else if (query[0] == 2) {
                query[1] = sc.nextInt();
                for (int k = 0; k < n; k++) {
                    if (query[1] == numArr[k]) {
                        q2Index = k;
                    }
                }
                System.out.println(q2Index == -1 ? 0 : q2Index + 1);
            } else {
                query[1] = sc.nextInt();
                query[2] = sc.nextInt();
                for (int l = query[1]; l <= query[2]; l++) {
                    System.out.print(numArr[l - 1] + " ");
                }
                System.out.println();
            }
        }
    }
}