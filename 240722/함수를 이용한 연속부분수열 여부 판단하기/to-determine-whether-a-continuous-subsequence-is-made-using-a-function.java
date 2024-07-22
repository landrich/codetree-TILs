import java.util.Scanner;

public class Main {
    public static boolean part(int[] numArr1, int[] numArr2) {
        String str1 = "", str2 = "";

        for (int i = 0; i < numArr1.length; i++) {
            str1 += String.valueOf(numArr1[i]);
        }

        for (int i = 0; i < numArr2.length; i++) {
            str2 += String.valueOf(numArr2[i]);
        }

        if (str1.indexOf(str2) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] numArr1 = new int[n1];
        int[] numArr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            numArr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            numArr2[i] = sc.nextInt();
        }

        if (part(numArr1, numArr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}