import java.util.NoSuchElementException;

public class MyStack<T> {
    private MyLinkedList<T> list;

    public MyStack() {
        list = new MyLinkedList<>();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.size() == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        T item = list.get(list.size() - 1);
        list.delete(list.size() - 1);
        return item;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
