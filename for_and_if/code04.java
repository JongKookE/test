package for_and_if;
import java.util.Scanner;

public class code04 {
    public static void main(String[] args) {
        int n = 100;
        int[] grade = new int[n];

        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] scannerArray = new int[num];

        System.out.printf("scannerArray's length = %d %n", scannerArray.length);
        grade[0] = 100;
        grade[1] = 90;
        grade[2] = 80;
        grade[3] = 70;
        grade[4] = 60;

        for (int i = 0; i < grade.length; i++) {
            System.out.printf("grade[%d] = %d %n", i, grade[i]);
        }
        kb.close();
    }
}
