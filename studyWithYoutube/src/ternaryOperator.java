public class ternaryOperator {
    public static void main(String[] args){
        boolean isMan = true;
        String ternary = isMan ? "is a man" : "is a girl"; 
        System.out.println(ternary);

        switch(ternary){
            case "is a man":
                System.out.println("1");
                break;
            case "is a girl":
                System.out.println("X");
                break;
            default:
                System.out.println("?");
        }
        
    }
}
