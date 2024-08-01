import java.util.Scanner;

public class Main {
    public static boolean twoApb(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j))
                    return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (twoApb(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}