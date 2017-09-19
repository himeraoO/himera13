package newpaket2.structure;

public class TwoWayList<T> implements CustomList<T> {
    private Element2 head;
    private Element2 tail;
    private class Element2 {
        Element2 next;
        Element2 prev;
        T value;
        Element2(T value){
            this.value = value;
        }
    }


    @Override
    public void add(T value) {
        Element2 el = new Element2(value);
        if (head == null){
            head = el;
            tail = el;
        } else {
            // tail - последний элемент
            // tail.next = null
            // добавляем новый элемент в конец
            tail.next = el; // пока еще последний элемент
            // ссфлается на новый элемент
            el.prev = tail;
            tail = el;      //
        }
    }

    @Override
    public void delete(int index) {

    }
}