package method;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Method_4 {
    static String[] firstName = new String[1000];
    static String[] secondName = new String[1000];
    static int count = 0;
    public static void main(String[] args) {
        
        
        try {
            Scanner inFile = new Scanner(new File("input.txt")); //File의 경우 반드시 예외문을 써줘야한다...
            while (inFile.hasNext()) {
                firstName[count] = inFile.next();
                secondName[count] = inFile.next();
                count++;
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No File");
            System.exit(0);
        }

       
        for (int i = 0; i < count; i++) {
            System.out.printf("Name = %s, family Name = %s %n", firstName[i], secondName[i]);
        }
    }

}
