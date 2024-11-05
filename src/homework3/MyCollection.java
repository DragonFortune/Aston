package homework3;

import java.util.Arrays;
import java.util.Collection;

public class MyCollection <T> implements CollectionInterface <T>{

    private int size;
    private T[] list;

    @SuppressWarnings("unchecked")
    public MyCollection(int initialSize) {
        if (initialSize < 0) {
            throw new IllegalArgumentException("Size must be non-negative");
        }
        this.list = (T[]) new Object[initialSize];
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    public MyCollection(Collection <? extends T> collection) {
        if (collection == null){
            throw new IllegalArgumentException("Collection cannot be null");
        }
        this.size = collection.size();
        this.list = (T[]) new Object[size];
        int i = 0;
        for (T element : collection){
            list[i++] = element;
        }
    }

    @Override
    public T get(int index) {
        return list[index];
    }

    @Override
    public void add(T element) {
        if (size == list.length){
            this.list = Arrays.copyOf(list, list.length+1);
        }
        list[size++] = element;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Incorrect index");
        }
        final var elemMoved = size - index - 1;
        System.arraycopy(list, index + 1, list, index, elemMoved);
        size--;
        list[size]=null;
    }

    @Override
    public void addAll(Collection <T> collection) {
        for (T element : collection) add(element);
    }

    @Override
    public void bubbleSort() {

    }

    @Override
    public String toString() {
        return "MyCollection{" + Arrays.toString(list) + '}';
    }
}
