import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cold = new char[3];
        int[] temp = new int[3];
        int[] clinic = new int[4];

        for (int i = 0; i < 3; i++) {
            cold[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (cold[i] == 'Y') {
                if (temp[i] >= 37) clinic[0]++;
                else clinic[2]++;
            } else {
                if (temp[i] >= 37) clinic[1]++;
                else clinic[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(clinic[i] + " ");
        }

        if (clinic[0] >= 2) System.out.print("E");
    }
}