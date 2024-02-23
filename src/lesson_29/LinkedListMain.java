package lesson_29;

import util.MyLinkedList;

import java.util.Arrays;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        System.out.println(linkedList);
        linkedList.add(100);

        linkedList.addFirst(50);

//        System.out.println(linkedList);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.addFirst(10);
        System.out.println(linkedList);

        System.out.println("remove value: " + linkedList.remove());
        System.out.println(linkedList);
        System.out.println("remove value: " + linkedList.remove());
        System.out.println("remove value: " + linkedList.remove());
        System.out.println("remove value: " + linkedList.remove());
        System.out.println("remove value: " + linkedList.remove());
        System.out.println(linkedList);

        linkedList.add(555);
        System.out.println(linkedList);
        System.out.println("linkedList.lastIndexOf(555): " + linkedList.lastIndexOf(555));

        linkedList.remove();
        System.out.println(linkedList.lastIndexOf(151));

        System.out.println("\n=====================================\n");

        linkedList.addAll(0, 1, 2, 3, 4, 5, 6, 7);
        System.out.println(linkedList);

        int index = linkedList.indexOf(3);
        System.out.println("index 3: " + index);
        System.out.println(linkedList.indexOf(7));
        System.out.println(linkedList.indexOf(100));

        Integer[] result = linkedList.toArray();
        System.out.println(Arrays.toString(result));
    }
}
