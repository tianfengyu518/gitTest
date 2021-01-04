package stream;

import java.util.stream.Stream;

/**
 * filter(Predicate<T>) 判断  test(T t)  延迟方法 返回的还是stream流，可以链式操作
 */
public class Demo02Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","李四","王五","赵六","田七");
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });

        stream1.forEach(name-> System.out.println(name));

    }
}
