package for_and_if;
import java.util.Scanner;

public class Code03 {
    public static void main(String[] args){
        String name;
        int age;
        String gender;

        Scanner kb = new Scanner(System.in);
        System.out.println("type your name, age, gender");
        name = kb.next();
        age = kb.nextInt();
        gender = kb.next();

        if(gender.equals("male")){
            System.out.printf("Hello %s your age is %d years old man", name, age, gender);
        } 
        else if(gender.equals("female")){
            System.out.printf("Hello %s your age is %d years old woman", name, age, gender);
        }
        else{
            System.out.println("hmm.. interesting");
        }
        kb.close();
    }
}
