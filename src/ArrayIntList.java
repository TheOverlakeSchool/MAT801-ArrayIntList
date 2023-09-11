import java.util.Arrays;

public class ArrayIntList {

    private int[] nums;
    private int size;
    private static final int DEFAULT_CAPACITY = 5;

    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayIntList(int i) {
        nums = new int[i];
    }


    public void add(int i) {
        ensureCapacity();
        nums[size] = i;
        size++;
    }

    public void addAll(int[] values) {
        for (int value : values) {
            add(value);
        }
    }

    public void add(int index, int num) {
        ensureCapacity();
        for (int i = size; i > index; i--) {
            nums[i] = nums[i - 1];
        }

        nums[index] = num;
        size++;
    }

    private void ensureCapacity() {
        if (size == nums.length) {
            nums = Arrays.copyOf(nums, size * 2);
        }
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
