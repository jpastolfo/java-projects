package exercises.ex3;

import java.util.ArrayList;

public class StackArrayList<T> implements Stack<T> {

    private final ArrayList<T> lista = new ArrayList<>();

    @Override
    public void push(T element) {
        lista.add(element);
    }

    @Override
    public T pop() {
        return lista.remove(lastIndex());
    }

    @Override
    public T peek() {
        return lista.get(lastIndex());
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    private int lastIndex() {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return size() - 1;
    }
}
