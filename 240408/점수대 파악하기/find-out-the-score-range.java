import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[100];
        int[] score = new int[11];
        int n;
        
        for (int i = 0; i < 100; i++) {
            n = sc.nextInt();
            if (n == 0) break;
            numArr[i] = n;
            score[numArr[i] / 10]++;
        } 

        for (int i = 10; i >= 1; i--) {
            System.out.println(i * 10 + " - " + score[i]);
        }
    }
}