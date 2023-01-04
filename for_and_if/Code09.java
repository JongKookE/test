package for_and_if;
import java.util.Scanner;

public class Code09 {
    public static void main(String[] args){
        int [] array = new int[5];
        Scanner keyBoard = new Scanner(System.in);
        

        for (int i=0; i<array.length; i++){
            int input = keyBoard.nextInt();
            array[i] = input;
        }
        keyBoard.close();
        System.out.print("배열: ");
        for(int i=0; i<array.length; i++){
            System.out.printf("%d ", array[i]);
        }
    }
}
