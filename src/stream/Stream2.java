package stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(System.out::println);

        List<List<String>> list1 = new LinkedList<>();
        list1.add(Arrays.asList("one","two","three"));
        list1.add(Arrays.asList("alice","bob","carry"));

        List<String> result = list1.stream()
                                   .flatMap(List::stream)
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());
        result.forEach(System.out::println);

    }
}
