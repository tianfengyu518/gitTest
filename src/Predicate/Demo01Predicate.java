package Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {

    public static boolean method(String str, Predicate<String> pre){
         return  pre.test(str);
    }

    public static void main(String[] args) {
        String str = "abcde";

        boolean isVaild = method(str, (String s)-> str.length()>5);

        System.out.println(isVaild);
    }

}
