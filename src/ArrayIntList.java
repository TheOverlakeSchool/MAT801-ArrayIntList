import java.util.Arrays;
import java.util.Iterator;

public class ArrayIntList implements IntList {

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
        addAll(values, values.length);
    }

    public void addAll(IntList list2) {
//        for (int i = 0; i < list2.size(); i++) {
//            add(list2.get(i));
//        }
        for (int i : list2) {
            add(i);
        }
    }

    private void addAll(int[] numsArray, int end) {
        for (int i = 0; i < end; i++) {
            add(numsArray[i]);
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


    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIntListIterator();
    }

    private class ArrayIntListIterator implements Iterator<Integer> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Integer next() {
            return get(currentIndex++);
        }
    }
}
