package Consumer;

import java.util.function.Consumer;

public class Demo03Consumer {

    public static void printInfo(String[] array, Consumer<String> con1, Consumer<String> con2){
        for (String s : array) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};

        printInfo(array,s-> System.out.println("姓名："+s.split(",")[0]),
                        s-> System.out.println("性别："+s.split(",")[1]));
    }
}
