package stream;

import java.util.stream.Stream;

/**
 * limit(long) 截取 延迟方法 返回的还是stream流，可以链式操作
 */
public class Demo05Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","2","3","4","5");
        //截取前两个元素
        Stream<String> stream1 = stream.limit(2);
        stream1.forEach(s->System.out.println(s));
    }
}
