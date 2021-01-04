package stream;

import java.util.stream.Stream;

/**
 * void foreach(Consumer<T>)  消费 accept()  终结方法 返回的不是stream流
 */
public class Demo01Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","李四","王五","赵六","田七");
        stream.forEach(name->System.out.println(name));

    }
}
