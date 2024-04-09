import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int n = sc.next().charAt(0);
        int index = -1;

        for (int i = 0; i < 6; i++) {
            if (word[i] == n) {
                index = i;
                break;
            }
        }

        System.out.println(index == -1 ? "None" : index);
    }
}