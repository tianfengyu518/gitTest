package lambda;
/*
函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class Demo {
    //定义一个方法，参数使用函数式接口
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        show(()->{
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });

        //简化lambda表达式  只有一条语句时可以省略大括号
        show(()-> System.out.println("使用lambda表达式重写接口中的抽象方法"));

    }
}
