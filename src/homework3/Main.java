package homework3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        MyCollection<String> list = new MyCollection<>(5);
        List<String> list1 = new ArrayList<>();
        list.add("hello");
        list.add("tree");
        list.add("world");
        list.remove(1);
        list1.add("12");
        list1.add("34");
        list1.add("44");
        list.addAll(list1);
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
