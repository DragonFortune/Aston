package homework3;

import java.util.Collection;

public interface CollectionInterface <T>{
    T get(int index);

    void add(T el);

    void remove(int index);

    void addAll(Collection<T> collection);

    void bubbleSort();
}
