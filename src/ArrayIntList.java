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
}
