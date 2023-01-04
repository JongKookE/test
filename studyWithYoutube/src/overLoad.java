import java.util.ArrayList;

import model.Character;
import model.Hero;
import model.ICharacter;
import model.Magician;
import model.Person;

public class overLoad {
    public static void main(String[] args){
        

        Person testPerson = new Person();
        Person newPerson = new Person("박종국", 23);
        
        System.out.println(testPerson);
        System.out.println(newPerson);

        Hero hero = new Hero("슈퍼맨"); 
        Hero hero2 = new Hero("배트맨");
        hero.attack(hero2);
        
        // Character character = new Hero("아이언맨");
        // Person character2 = new Hero("원더우먼");
 
        Magician magician = new Magician();
        Character magician2 = new Magician();
        ICharacter magician3 = new Magician();

        if(magician3 instanceof Magician){
           System.out.println("Magician Girl!!"); 
        }
        else{
            System.out.println("Magician Boy....");
        }
        ArrayList<Character> characterArrayList = new ArrayList<>();
        characterArrayList.add(magician);
        characterArrayList.add(magician2);
        characterArrayList.add(hero);

        System.out.println(characterArrayList);
    }

    
    public static int add(int x, int y){
        return x+y;
    }
    public static int add(int x, int y, int z){
        return x+y+z;
    }
    public static int add(int x){
        return (int) Math.pow(x, 2);
    }
    public static int add(int... numbers){
        int sum =0;
        for(int i=0; i<numbers.length; i++){
            sum += i;
        }
        return sum;
    }
}


    
