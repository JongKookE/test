package for_and_if;
import java.util.Scanner;

public class Code07 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        int [] numArray = new int[8];
        //int [] numArray = new int[] {1,2,3,4,5,6,7,8};
        
        for(int i=0; i<numArray.length; i++){
            numArray[i] = keyBoard.nextInt();
        }
        keyBoard.close();
        
        int tmp = numArray[numArray.length-1];
        for(int i=numArray.length-2; i>=0; i--){
            numArray[i+1] = numArray[i];
        }
        numArray[0] = tmp;
        for(int i=0; i < numArray.length; i++){
            System.out.println(numArray[i]);
        }
    }
}
