package tasktwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringlist {
    //i/p:abc,  ,bcd,  ,ef,  ,..
    //o/p:abc,bcd,ef

    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","","bc","efg","abcd","","jkl");
        List<String> list1  =list.stream().filter(x->!x.isEmpty()).
                collect(Collectors.toList());
        System.out.println(list1);
    }
}
