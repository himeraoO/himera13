package newpaket2.structure;

public class DynamicArrayCustomList<T> implements CustomList<T> {

    private Object[] array;
    private int size;

    public DynamicArrayCustomList() {
        this(5);
    }

    public DynamicArrayCustomList(int initialLength) {
        this.array = new Object[initialLength];
        this.size = 0;
    }

    @Override
    public void add(T value) {
        if (size == array.length) {
            // increase length
            System.out.println("Increase length. Current size = " + size +
                    ", new size = " + array.length * 1.5);
            Object[] oldArray = array;
            array = new Object[(int)(array.length * 1.5)];
            System.arraycopy(oldArray, 0, array, 0, size);
        }
        // array[size] = value;
        // size++;
        array[size++] = value;
    }

    @Override
    public void delete(int index) {
    int elCopy = size - index - 1;                                      //количество элементов для копирования после элемента с index
        Object[] oldArray = array;                                      //исходный массив
    if(elCopy > 0) {
        System.arraycopy(oldArray, index + 1, oldArray, index, elCopy); //начинать копировать из исходного массива
                                                                        //со следующего элемента после index
                                                                        //копировать в исходный массив
                                                                        //начиная с позиции элемента index
                                                                        //копировать нужное количество элементов
    }
    oldArray[--size] = null;                                            //уменьшаем размер массива и забываем про последний элемент

    }

}
