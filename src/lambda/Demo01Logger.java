package lambda;
/*
   日志案例
 */
public class Demo01Logger {

    public static void log(int level,String msg){
        if (level==1){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        log(1,msg1+msg2+msg3);
    }
}
