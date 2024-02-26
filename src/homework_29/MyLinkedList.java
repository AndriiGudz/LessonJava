package homework_29;

import org.junit.platform.engine.support.hierarchical.Node;
import util.MyList;

import java.lang.reflect.Array;

public class MyLinkedList<T> implements MyList<T>, MyQueue<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    // метод добавления элемента в конец списка
    public void add(T value) {
        if (first == null) {
            // тогда не существует ни одного элемента. Добавляемая нода станет первой и пока единственной.
            first = new Node<>(value, null, null);
        } else if (last == null) {
            // в данном кейсе существует только один узел first
            // справа от first приклеить новую ноду
            last = new Node<>(value, first, null);
            // нам надо организовать связь "направо" от ноды first
            first.next = last;
        } else {
            // когда существует first и last объект (обе ссылки не равны null)
            Node<T> temp = last;

            last = new Node<>(value, temp, null);
            temp.next = last;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append(", ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //  Добавить элемент слева
    public void addFirst(T value) {
        if (first == null) {
            // список пустой
            first = new Node<>(value, null, null);
        } else if (last == null) {
            // есть только 1 нода (first)
            last = first;
            first = new Node<>(value, null, last);
            last.previous = first;
        } else {
            // все остальные состояния - у нас 2 или больше узлов
            Node<T> temp = first;
            first = new Node<>(value, null, temp);
            temp.previous = first;
        }
        size++;
    }

    // Удаляем самый первый (левый) элемент.
    public T remove() {
        if (size == 0) return null;
        // если нод больше чем 0, мы должны будем удалить ноду first
        T value = first.value;
        if (size == 1) {
            first = null;
        } else if (size == 2) {
            // у нас только 2 ноды - first и last
            // мы должны last сделать first
            first = last;
            // first = first.next; - альтернативный вариант
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }
        size--;
        return value;
    }

    // Удаляем последний элемент
    public T removeLast() {
        if (size == 0) return null;
        T value;
        // T value = (size == 1) ? first.value : last.value; - альтернативный вариант
        if (size == 1) {
            // только одна нода first
            value = first.value;
            first = null;
        } else if (size == 2) {
            // сценарий в котором удаляем ноду last
            value = last.value;
            last = null;
            first.next = null;
        } else {
            value = last.value;
            last = last.previous;
            last.next = null;
        }
        size--;
        return value;
    }


    @Override
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int indexOf(T value) {
        int index = 0;

        // нужно перебрать мой список, начиная с головы
        // проверять - совпадает ли value в текущем узле с тем, что мы ищем. Если совпадает - вернуть индекс
        // не забыть увеличить мой счетчик индекса,
        // проверить значение в следующем элементе, если он есть

        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            index++;
            cursor = cursor.next;
        }

        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        // if (size == 0) return -1; альтернативная проверка, сейчас делаем проверку в if ниже
        int index = size - 1;

        Node<T> cursor = last;
        // когда у нас только нода first - цикл не выполнится ни разу
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            index--;
            cursor = cursor.previous;
        }
        // обработка сценария, когда есть нода first
        if (size != 0 && first.value.equals(value)) return 0;
        // альтернативная проверка
        // if (size != 0 && first.value.equals(value)) return 0;

        return -1;
    }

    private void removeNode(Node<T> node) {
        if (node == first) {
            remove();
            return;
        }

        if ((node == last)) {
            removeLast();
            return;
        }

        node.previous.next = node.next;
        node.next.previous = node.previous;

        // не обязательное действие
        node = null;
        size--;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {

        T[] result = (T[]) Array.newInstance(first.value.getClass(), size);

        return result;
    }

    @Override
    public boolean remove(T value) {
        Node<T> current = first;
        while (current != null) {
            if (current.value.equals(value)) { // Если найдено значение, которое нужно удалить
                removeNode(current); // Удаляем узел из списка
                return true; // Возвращаем true, так как удаление выполнено успешно
            }
            current = current.next; // Переходим к следующему узлу
        }
        return false; // Если значение не найдено, возвращаем false
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index is out of bounds: " + index);
        }

        Node<T> nodeToRemove = getNode(index); // Получаем узел, который нужно удалить

        removeNode(nodeToRemove); // Удаляем узел из списка

        return nodeToRemove.value; // Возвращаем значение удаленного узла
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // Возвращаем true, если размер списка равен 0, иначе - false
    }

    // Получить значение по индексу
    @Override
    public T get(int index) {
        // Проверяем, что индекс находится в допустимом диапазоне
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds: " + index);
        }

        // Находим узел списка, соответствующий заданному индексу
        Node<T> currentNode = getNode(index);

        // Возвращаем значение найденного узла
        return currentNode.value;
    }

    // Перезаписывает значение по указанному индексу
    @Override
    public void set(int index, T value) {
        // Проверяем, что индекс находится в допустимом диапазоне
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds: " + index);
        }

        // Находим узел списка, соответствующий заданному индексу
        Node<T> currentNode = getNode(index);

        // Устанавливаем новое значение для найденного узла
        currentNode.value = value;
    }

    // Вспомогательный метод для нахождения узла списка по индексу
    private Node<T> getNode(int index) {
        Node<T> currentNode = first;
        // Проходим по списку до тех пор, пока не достигнем нужного индекса
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    // добавить в конец
    @Override
    public void addLast(T value) {
        if (isEmpty()) { // Если список пустой, добавляем первый элемент
            add(value);
        } else { // Если в списке уже есть элементы
            Node<T> newNode = new Node<>(value, last, null); // Создаем новый узел с указанием предыдущего узла (last) и следующего узла (null)
            last.next = newNode; // Устанавливаем ссылку на новый узел в качестве следующего узла для последнего узла списка
            last = newNode; // Перемещаем указатель last на новый узел
            size++; // Увеличиваем размер списка
        }
    }

    // значение "головы" списка
    @Override
    public T getFirst() {
        if (isEmpty()) { // Проверяем, пуст ли список
            return null; // Возвращаем null, если список пустой
        } else {
            return first.value; // Возвращаем значение первого узла списка
        }
    }

    // значение самого правого элемента списка
    @Override
    public T getLast() {
        if (isEmpty()) { // Проверяем, пуст ли список
            return null; // Возвращаем null, если список пустой
        } else {
            return last.value; // Возвращаем значение последнего узла списка
        }
    }

    // Удаляет первый элемент списка
    @Override
    public T removeFirst() {
        if (isEmpty()) { // Проверяем, пуст ли список
            return null; // Возвращаем null, если список пустой
        } else {
            T value = first.value; // Получаем значение первого элемента списка
            remove(); // Удаляем первый элемент списка
            return value; // Возвращаем значение удаленного элемента
        }
    }

    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> newt) {
            this.value = value;
            this.previous = previous;
            this.next = newt;
        }
    }
}
