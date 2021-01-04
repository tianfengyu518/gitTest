package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo03Predicate {

    public static ArrayList<String> method(String[] array, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<String>();
        for (String s : array) {
           boolean b =  pre1.and(pre2).test(s);
            if (b){
                list.add("姓名："+s.split(",")[0]+",性别："+s.split(",")[1]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};

        ArrayList<String> list =  method(array,(String str)->{
            return   str.split(",")[1].equals("女");
        },(String str)->{
            return str.split(",")[0].length()==4;
        });

        list.stream().forEach(System.out::println);


    }
}
