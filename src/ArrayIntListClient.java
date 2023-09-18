import javax.sound.midi.Soundbank;
import java.util.Iterator;

public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(42);
       // list.addAll(new int[]{3,4,5,6,7});

        IntList list2 = new ArrayIntList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list.addAll(list2);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value == 42) {
             //   iterator.remove(); <-- Needs to be defined
            }
            System.out.println(iterator.next());

        }
        System.out.println(list);
    }
}
