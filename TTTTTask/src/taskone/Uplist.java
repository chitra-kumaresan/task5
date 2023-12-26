package taskone;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uplist {
    public static void main(String[] args) {
        //i/p:abcd
        //o/p:ABCD

        Stream<String>names=Stream.of("aBc","d","ef");

        List<String> str= names.map(x->x.toUpperCase()).collect(Collectors.toList());
                System.out.println(str);
    }
}
