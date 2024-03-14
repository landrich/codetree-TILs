import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min, max;
        
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }
    }
}