import java.util.Random;

public class App {
    static Random zeroToNine = new Random();
    static int n = 10;
    static int[] randArray = new int[n];
    public static void main(String[] args)  {
        
        bubbleSort(n, randArray);
        
    }
    static void bubbleSort(int n, int[] data){
        for(int i=0; i<n; i++){
            int random = zeroToNine.nextInt(n);
            randArray[i] = random;
        }
        for(int i=0; i<10; i++){
            System.out.printf("%d ", randArray[i]);
        }
        System.out.printf("\nrandArray's length = %d\n",randArray.length);
        for(int i = n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(data[j] >data[j+1]){
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp; 
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.printf("%d ", data[i]);
        }
    }
}
