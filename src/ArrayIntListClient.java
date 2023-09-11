public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList(11);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(42);
        list.addAll(new int[]{3,4,5,6,7});
        list.add(1,7);
        System.out.println(list);
    }
}
