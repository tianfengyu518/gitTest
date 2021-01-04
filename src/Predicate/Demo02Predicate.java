package Predicate;

import java.util.function.Predicate;

public class Demo02Predicate {
    public static boolean method(String str, Predicate<String> pre){
       //  return  pre1.test(str) && pre2.test(str);
     //   return pre1.and(pre2).test(str);
      //  return pre1.or(pre2).test(str);
        return pre.negate().test(str);
    }
    public static void main(String[] args) {
        String str = "fdw";
        boolean isVaild = method(str, (String s)-> str.length()>5);
        System.out.println(isVaild);
    }
}
