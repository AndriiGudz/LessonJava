package util;

public class MyLinkedList<T> {

    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> newt;

        public Node(T value, Node<T> previous, Node<T> newt) {
            this.value = value;
            this.previous = previous;
            this.newt = newt;
        }
    }
}
