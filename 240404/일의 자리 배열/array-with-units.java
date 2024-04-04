import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int temp;
        numArr[0] = sc.nextInt();
        numArr[1] = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            temp = numArr[i - 2] + numArr[i - 1];
            numArr[i] = temp >= 10 ? temp - 10 : temp; 
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}