package for_and_if;
import java.util.Scanner;

public class Code06 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        //int input = keyBoard.nextInt();
        int [] data = new int[5];
        int max = data[0];

        for(int i=0; i<data.length; i++){
            data[i] = keyBoard.nextInt();
            if(data[i] >= max){
                max = data[i];
            }
        }
        keyBoard.close();
        System.out.printf("최대값은 %d", max);
    }
        
}
