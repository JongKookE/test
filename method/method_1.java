package method;

import java.util.Scanner;

public class method_1{
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        int a = keyBoard.nextInt();
        int b = keyBoard.nextInt();

        int sum = power(a,b);
        System.out.println(sum);
        keyBoard.close();
    }


    static int power(int n,int m){
        int dupli = 1;
        for(int i=0; i<m; i++){
            dupli = dupli * n;
        }
        return dupli;

    }
}