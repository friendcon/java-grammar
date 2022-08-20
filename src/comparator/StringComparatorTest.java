package comparator;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class StringComparatorTest {
    public static void main(String[] args) {
        // MyCompare 오름차순 정렬
        TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
        treeSet.add("hello");
        treeSet.add("my");
        treeSet.add("a");

        System.out.println(treeSet.toString());

        // MyCompare 내림차순 정렬
        TreeSet<String> treeSet2 = new TreeSet<String>(new MyCompare2());
        treeSet2.add("lkflfi");
        treeSet2.add("zdiwl");
        treeSet2.add("aaaa");
        System.out.println(treeSet2.toString());
    }
}
