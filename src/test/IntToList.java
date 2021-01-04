package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntToList {

    public static void main(String[] args) {
        int[] ints = {1,2,3};

        //基本数据类型不能直接转换，Stream.boxed()： 基本类型->包装类
        List<Integer> list1 = IntStream.of(ints).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(ints).boxed().collect(Collectors.toList());
    }
}
