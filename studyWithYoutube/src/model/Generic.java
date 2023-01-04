package model;

public class Generic {
    public static void main(String[] args){
        print("안녕");
        print(3.0025);
        print(true);

        System.out.println("1");

        new Thread(()->{
            
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException z){
                    z.printStackTrace();
                }
                for(int i =1; i<6; i++){
                    System.out.println(Thread.currentThread().getName()+i);
                }

        }).start();

        new Thread(new Runnable() {
            public void run(){
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException z){
                    z.printStackTrace();
                }
                for(int i =1; i<6; i++){
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }).start();

        

    }
    public static <X> void print(X anyElse){
        System.out.println(anyElse);
    }
}
