import javax.sound.midi.Soundbank;

public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        System.out.println("Is empty? " + list.isEmpty());
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(42);
        list.addAll(new int[]{3,4,5,6,7});
        list.add(1,7);
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list.remove(5));
        System.out.println(list);
        System.out.println("Is empty? " + list.isEmpty());
        System.out.println("Contains 42?" + list.contains(42));
        System.out.println("Contains 7?" + list.contains(7));
        IntList list2 = new ArrayIntList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list.addAll(list2);
        System.out.println(list);
    }
}
