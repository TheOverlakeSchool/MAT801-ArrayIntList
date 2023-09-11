import java.util.ArrayList;

public class ArrayIntList {

    private int[] nums;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public ArrayIntList() {
        nums = new int[DEFAULT_CAPACITY];
    }

    public void add(int i) {
        nums[size] = i;
        size++;
    }

    public void add(int index, int num) {
        nums[index] = num;
        size++;
    }

    public String toString() {
        String str = "[";
        if (size > 0) {
            str += nums[0];
            for (int i = 1; i < size; i++) {
                str += ", " + nums[i];
            }
        }
        return str + "]";
    }

    public int size() {
       return size;
    }

}
