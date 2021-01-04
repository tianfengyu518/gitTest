package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Tree {

    /**
     * 向父章节中添加子章节
     * @param parent   父章节
     * @param allChapters  全部章节
     * @return  父章节的全部子章节的集合
     */
    public static List<Chapter> getChildren(Chapter parent,List<Chapter> allChapters){
        List<Chapter> children = allChapters.stream()
                                            .filter(ch->Objects.equals(parent.getId(),ch.getParentId()))  //过滤：章节父id = id
                                            .map(ch-> {
                                                ch.setChildren(getChildren(ch,allChapters));  //添加到子章节集合
                                                return ch;
                                            }).collect(Collectors.toList());   //stream流转list
        return children;
    }

    //测试
    public static void main(String[] args) {

        List<Chapter> chapterList = Arrays.asList(
                new Chapter(1,0),
                new Chapter(2,1),
                new Chapter(3,2),
                new Chapter(4,2),
                new Chapter(5,2),
                new Chapter(6,1),
                new Chapter(7,6),
                new Chapter(8,6)
        );

        List<Chapter> list = chapterList.stream().filter(ch -> ch.getParentId() == 0)  //过滤：parentid=0  根章节
                .map(ch -> {
                    ch.setChildren(getChildren(ch, chapterList));
                    return ch;
                }).collect(Collectors.toList());

        list.stream().forEach(System.out::println);

    }
}
