import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String[] strArr = new String[100];

        for (int i = 0; i < 200; i++) {
            strArr[i] = sc.next();
            cnt++;
            if (strArr[i].equals("0")) break;    
        }

        System.out.println(cnt - 1);

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("0")) {
                break;
            } else if (i % 2 == 0) {
                System.out.println(strArr[i]);
            }
        }
    }
}