import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> ml = new MyLinkedList<>();

        ml.add(1);
        ml.add(2);

        System.out.println(ml.get(0));
    }
}

