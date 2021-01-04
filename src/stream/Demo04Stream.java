package stream;

import java.util.stream.Stream;

/**
 * long count 终结方法 返回的不是stream流
 */
public class Demo04Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","2","3","4","5");
        long count = stream.count();
        System.out.println(count);


    }
}
