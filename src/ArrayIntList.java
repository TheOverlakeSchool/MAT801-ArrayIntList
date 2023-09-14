import java.util.Arrays;

public class ArrayIntList {

    private int[] nums;
    private int size;
    private static final int DEFAULT_CAPACITY = 5;

    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayIntList(int i) {
        super();
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

    public int get(int index) {
        isValidIndex(index);
        return nums[index];
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

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int remove(int index) {
        isValidIndex(index);
        int temp = nums[index];
        for (int i = index; i < size - 1; i++) {
            nums[i] = nums[i+1];
        }
        size--;
        nums[size] = 0;
        return temp;
    }

    private void isValidIndex(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }


    public void clear() {
        size = 0;
        nums = new int[DEFAULT_CAPACITY];
    }
}
