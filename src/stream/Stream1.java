package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        //1、collection.stream()创建
        Stream<String> stream1 = list1.stream();
        //2、Stream.of()创建
        Stream<String> stream2 = Stream.of("aaa","bbb","ccc");
        Stream<Integer> stream3 = Stream.of(1,2,3);
        //3、Stream.iterate()
        Stream<Integer> stream4 = Stream.iterate(1,item->item+1).limit(10);


    }
}
