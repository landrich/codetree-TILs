import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int qNum = sc.nextInt();

        for (int i = 0; i < qNum; i++) {
            int qType = sc.nextInt();
            if (qType == 1) {
                int qType1Front = sc.nextInt();
                int qType1Back = sc.nextInt();

                char[] strToArr = str.toCharArray();
                char temp = strToArr[qType1Front - 1];
                strToArr[qType1Front - 1] = strToArr[qType1Back - 1];
                strToArr[qType1Back - 1] = temp;

                str = String.valueOf(strToArr);

                System.out.println(str);
            } else if (qType == 2) {
                char qType2Front = sc.next().charAt(0);
                char qType2Back = sc.next().charAt(0);
                String q2Result = "";

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == qType2Front) {
                        q2Result += qType2Back;
                        
                    } else {
                        q2Result += str.charAt(j);
                    }
                }

                str = q2Result;
                System.out.println(str);
            }
        }
    }
}