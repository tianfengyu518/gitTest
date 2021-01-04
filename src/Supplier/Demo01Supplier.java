package Supplier;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static Integer getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
     //   String str = getString(()-> "abc");

    //    System.out.println(str);

        int[] arr = {100,43,135,21,5,131};

        Integer maxInteger = getMax(()->{
            int max = arr[0];
            for (int i : arr) {
                if (i>max){
                    max = i;
                }
            }
            return max;
        });

        System.out.println(maxInteger);
    }
}
