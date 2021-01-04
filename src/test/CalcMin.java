package test;

import java.util.stream.IntStream;

public class CalcMin {

    public static void main(String[] args) {

        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int min = IntStream.of(nums).min().getAsInt();
        System.out.println("最小值："+min);

    }
}
