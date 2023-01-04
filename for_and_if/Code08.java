package for_and_if;
// shift + alt + f 자동정렬

public class Code08 {
    public static void main(String[] args) {
        for (int n = 2; n <= 10000; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n && isPrime; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(n);
                }
            
        }
    }
}
