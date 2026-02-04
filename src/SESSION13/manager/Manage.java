package SESSION13.manager;

public interface Manage<T> {
    void add(T t);
    void delete(int index);
    void update(int index, T t);
    void display();
}
