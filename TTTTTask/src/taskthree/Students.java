package taskthree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {

        List<String>stringList= new ArrayList<>(10);
        stringList.add("Abishek");
        stringList.add("Abinaya");
        stringList.add("Arjun");
        stringList.add("Boomithran");
        stringList.add("Aishwarya");
        stringList.add("Caroline");
        stringList.add("Darani");
        stringList.add("Gomathi");
        stringList.add("Eswari");
        stringList.add("Ananya");
        System.out.println(stringList);
        //i/p:ab,apple,fruit,an
        //o/p:ab,apple,an---filtered
        List<String>stringList2 = stringList.stream().filter(x->x.charAt(0)=='A').collect(Collectors.toList());
        System.out.println(stringList2);




    }
}
