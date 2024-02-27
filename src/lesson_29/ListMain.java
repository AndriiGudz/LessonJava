package lesson_29;

import util.MyLinkedList;
import util.MyList;

import java.util.Arrays;

public class ListMain {
    public static void main(String[] args) {

        MyList<String> list = new MyLinkedList<>();
        list.add("Str");

        String[] strings = list.toArray();

        System.out.println(Arrays.toString(strings));

        System.out.println(list.remove("Str"));
        System.out.println(list);

        list.addAll("Str1", "Str2", "Str3", "Str4", "Str5", "Str6", "Str7");
        System.out.println(list.remove(0));
        System.out.println(list);

    }
}
