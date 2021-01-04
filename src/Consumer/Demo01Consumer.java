package Consumer;

import java.util.function.Consumer;

public class Demo01Consumer {
        public static void method(String name, Consumer<String> con){
            con.accept(name);
        }

    public static void main(String[] args) {
        method("张三",(name)->{
            //直接输出
            System.out.println(name);
            //反转输出
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);
        });
    }
}
