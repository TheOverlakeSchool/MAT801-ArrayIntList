public interface IntList extends Iterable<Integer> {
    int get(int index);
    void add(int value);
    void addAll(IntList list);
    void add(int index, int value);
    int remove(int index);
    int size();
}
