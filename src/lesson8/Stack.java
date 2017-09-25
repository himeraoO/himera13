package lesson8;

public interface Stack<T> extends Iterable<T> {

    void push(T value);

    T pop();
}
