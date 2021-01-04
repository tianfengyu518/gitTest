package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo08Stream {

    static int group = 1;

    public static void main(String[] args) {
        List<String[]> eggs = new ArrayList<>();
        eggs.add(new String[]{"鸡蛋_1","鸡蛋_1","鸡蛋_1","鸡蛋_1","鸡蛋_1"});
        eggs.add(new String[]{"鸡蛋_2","鸡蛋_2","鸡蛋_2","鸡蛋_2","鸡蛋_2"});



        eggs.stream()
                .flatMap(x->Arrays.stream(x).map(y->y.replace("鸡","煎")))
                .forEach(x->System.out.println(x))  ;
    }
}
