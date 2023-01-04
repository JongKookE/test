package for_and_if;
import java.util.Scanner;

public class Code05 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        Scanner keyBoard = new Scanner(System.in);
        // int number = keyBoard.nextInt();
        int b = keyBoard.nextInt();
        for(int i =0; i < b; i++){
            System.out.printf("%d번째 Array= %d %n", i, array[i]);
        }
        keyBoard.close();

    }
}
