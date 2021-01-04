package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 频率统计
 */
public class Test {
    public static void main(String[] args) {
        // 统计出现频率
        List<Integer> ns = Arrays.asList(1, 2, 3, 2, 4, 3, 2);

        // 频率为 Long
        Map<Integer, Long> map1 = ns.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//      Map<Integer, Long> map1 = ns.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));


        // 频率为 Integer
       // Map<Integer, Integer> map3 = ns.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.reducing(0)));


    }
}