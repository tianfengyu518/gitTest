package stream;

import java.util.stream.Stream;

/**
 * map(Function<T,R>) 类型转换  延迟方法 返回的还是stream流，可以链式操作
 */
public class Demo03Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","2","3","4","5");
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        stream2.forEach((in)->System.out.println(in));

    }
}
