import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String[] strArr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].charAt(2) == ch || strArr[i].charAt(3) == ch) {
                System.out.println(strArr[i]);
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}