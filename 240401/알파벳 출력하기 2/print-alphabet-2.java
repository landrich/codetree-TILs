import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char alp = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j > i; j--) {
                if (alp > 'Z') alp = 'A';
                System.out.print(alp++ + " ");
            }
            System.out.println();
        }
    }
}