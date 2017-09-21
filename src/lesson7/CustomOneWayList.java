package lesson7;

public class CustomOneWayList<T> implements CustomList<T> {

    private Element head;
    private int size;

    private class Element {
        Element next;
        T value;
        Element(T value) {
            this.value = value;
        }
    }

    @Override
    public void add(T value) {
        Element el = new Element(value);
        if (head == null) {
            head = el;
        } else {
            Element current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = el;

            // tail - текущий последний элемент
            // tail.next = null
            // добавляем новый элемент в конец
//            tail.next = el; // пока еще последний элемент
//            // ссылает на новый элемент
//            tail = el;
        }
        size++;
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index be must positive" +
                    "and less than size");
        }

        if (index == 0) {
            head = head.next;
        } else {
            int currentIndex = 0;
            Element current = head;
            Element prev = null;
            while (currentIndex != index) {
                prev = current;
                current = current.next;
                currentIndex++;
            }

            prev.next = current.next;
        }
        size--;
    }
}