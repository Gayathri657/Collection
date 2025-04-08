import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeeset {
    public static void main(String args[]) {
        TreeSet a = new TreeSet();
        a.add(10);
        a.add(40);
        a.add(50);
        a.add(100);
        a.add(70);
        a.add(80);
        System.out.println(a);
        NavigableSet<Integer> r = a.descendingSet();
        System.out.println(r);
    }
}
