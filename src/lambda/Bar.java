package lambda;

public interface Bar {

    void fahren(int value);

    /*
       default： 大多用于定义接口
       作用：使用它定义的方法，集成该接口时不需要实现该方法
     */
    default void gehen(){
        System.out.println("this is gehen");
        fahren(33);
    }

    default void fliegen(){
        System.out.println("fliegen");
    }
}
