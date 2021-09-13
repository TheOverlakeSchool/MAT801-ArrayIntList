public class ArrayIntList {
    private int size;
    private int[] nums;
    static final int DEFAULT_CAPACITY = 10;

    public ArrayIntList() {
        size = 0;
        nums = new int[DEFAULT_CAPACITY];
    }
    public void add(int value) {
        nums[size] = value;
        size++;
    }

    public void add(int index, int value) {
        for (int i = size; i > index; i--) {
            nums[i] = nums[i-1];
        }
        nums[index] = value;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String str = "[" + nums[0];
        for (int i = 1; i < size; i++) {
            str += ", " + nums[i];
        }
        str += "]";
        return str;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return nums[index];
    }

    public void set(int index, int value) {
        // TODO Can we ADD here? or only SET existing
        // indexes?
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        nums[index] = value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            nums[i] = nums[i + 1];
        }
        size--;
        nums[size] = 0;
    }
}
