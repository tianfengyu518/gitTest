package lambda;
/*
   日志案例
   使用lambda优化
 */
public class Demo02Logger {

    public static void log(int level,MessageBuilder mb){
        if (level==1){
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        log(1,()->{return msg1+msg2+msg3;});
    }
}
