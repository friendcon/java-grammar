package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorPrac {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> result = list.iterator();
        while (result.hasNext()) {
            System.out.println(result.next());
        }
    }
}
