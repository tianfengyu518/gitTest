package stream;

import java.util.stream.Stream;

/**
 * skip(long) 跳过 延迟方法 返回的还是stream流，可以链式操作
 */
public class Demo06Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","2","3","4","5");
        //跳过前两个元素
        Stream<String> stream1 = stream.skip(2);

        stream1.forEach(s->System.out.println(s));
    }
}
