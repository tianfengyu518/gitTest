package stream;

import java.util.stream.Stream;

/**
 * concat(stream1,stream2) 合并两个流   Stream类的静态方法 延迟方法 返回的还是stream流，可以链式操作
 */
public class Demo07Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("1","2","3","4","5");
        Stream<String> stream2 = Stream.of("dsa","dasd","dasdd","dadsa","dadsa");
        //合并2个流
        Stream<String> concat = Stream.concat(stream1, stream2);

        concat.forEach(s-> System.out.println(s));

    }
}
