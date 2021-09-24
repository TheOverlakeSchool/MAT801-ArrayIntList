import java.util.stream.IntStream;

public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();

        // range is start INCLUSIVE, end EXCLUSIVE
        // IntStream.range(1,10).forEach(n -> list.add(n));

        int[] intList = {-4,2,7,10,15,20,22,25,30,36,42,50,56,68,85,92,103};
        list.addAll(intList);

        list.sort();
        System.out.println(list.binarySearch(36));
    }
}


