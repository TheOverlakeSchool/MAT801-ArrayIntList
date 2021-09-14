import java.util.stream.IntStream;

public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();

        // range is start INCLUSIVE, end EXCLUSIVE
        // IntStream.range(1,10).forEach(n -> list.add(n));

        for (int i = 1; i <=10; i++) {
            list.add(i);
        }

        System.out.println(list);
        list.remove(9);

        System.out.println(list);
    }
}


