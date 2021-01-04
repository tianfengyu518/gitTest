package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo09Stream {
    /**
     * 准备测试数据
     */
    public static List<User> data() {
        List<User> users = Arrays.asList(
                new User(1, "张三", 1),
                new User(2, "李四", 1),
                new User(3, "王五", 2),
                new User(4, "悟空", 2),
                new User(5, "悟净", 2),
                new User(4, "大圣", 2),  // id 与大圣的重复了，认为是同一个对象
                new User(1, "Alice", 1) // id 与张三的重复了，认为是同一个对象
        );

        return users;
    }

    public static void main(String[] args) {
        //按照ID排序  没reversed()是升序，有是降序
        List<User> result = null;

      //  result = data().stream().sorted(Comparator.comparing(User::getId).reversed()).collect(Collectors.toList());

     /*   result = data().stream()
                .sorted(Comparator.comparing(User::getId).thenComparing(User::getUsername))
                .collect(Collectors.toList());*/

        result = data();
        Map<Integer, List<User>> teamUsers = result.stream().collect(Collectors.groupingBy(User::getTeamId));

        System.out.println(result);

    }
}
