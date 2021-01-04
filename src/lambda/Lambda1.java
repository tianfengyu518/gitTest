package lambda;

public class Lambda1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("aaa");
        });

        thread1.start();
    }
}
