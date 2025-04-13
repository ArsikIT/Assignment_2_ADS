public interface MyList<T> {
    void add(T element);
    void remove(int index);
    void clear();
    T get(int index);
    int size();

    void set(int index, T value);
}
