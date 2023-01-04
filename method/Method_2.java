package method;

public class Method_2 {
    public static void main(String[] args){
        for(int i=2; i<=10000; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }        
        }
        return true;
    }
}
