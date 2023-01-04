package method;

import java.util.Scanner;

public class Method_3 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        int[] array = new int[5];
        for (int i=0; i<array.length; i++){
            int number = keyBoard.nextInt();
            array[i] = number;
        }

        bubbleSort(array.length, array);
        for (int i=0; i<array.length; i++){
            System.out.printf("%d,",array[i]);
        }
        

        keyBoard.close();
    }

    static void bubbleSort(int n, int[] data){
        for(int i = n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(data[j] >data[j+1]){
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp; 
                }
            }
        }
    }
}
