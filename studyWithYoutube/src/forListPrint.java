import java.util.ArrayList;

public class forListPrint {
    public static void main(String[] args){
        int[] score =  {10,20,30,40,50};
        
        System.out.println(score.toString());
        
        ArrayList<String> scoreList = new ArrayList<>();
        scoreList.add("NULL");
        scoreList.add("not NULL");
        scoreList.add("haha this is just STRING");
        scoreList.add(2,"please remove me!");
        scoreList.remove(2);
        System.out.println(scoreList);


    }
}
