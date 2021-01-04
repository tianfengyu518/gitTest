package Consumer;

import java.util.function.Consumer;

public class Demo02AndThen {

    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
       // con1.accept(s);
       // con2.accept(s);
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("aaa",(s)->{
            //转大写
            System.out.println(s.toUpperCase());
        }, (s)->{
            //转小写
            System.out.println(s.toLowerCase());
        });
    }
}
