package method;

public class Method_5 {
    public static void main(String[] args){
        forArray();
}
    public static int forArray(){
        String[] array = new String[]  {"1234"};
        int number;
        try{
            number = Integer.parseInt(array[0]);
            System.out.println(number+5);
        } catch(NumberFormatException e){
            System.out.println("Miss Type Match!!");
        }
        
        return 0;
    }
}
