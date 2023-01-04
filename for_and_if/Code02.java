package for_and_if;
import java.util.Scanner; // alt + shift + o를 하면 필요한 라이브러리를 자동으로 가져옴

public class Code02 {
    public static void main(String[] args){
        String number = "dh";
        String input;
        Scanner kb = new Scanner(System.in);
        input = kb.next();
        System.out.println("input이 뭐야?");
        System.out.println(input);
        if (number.equals(input)){
            System.out.println("numbers, match!");
        }
        else{
            System.out.println("number doesn't match ㅠㅠ");
        }
        kb.close();
    }
}