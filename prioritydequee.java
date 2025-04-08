import java.util.Collections;
import java.util.PriorityQueue;

public class prioritydequee {
    public static void main(String[] args) {
        PriorityQueue a = new PriorityQueue(Collections.reverseOrder());
        a.add(10);
        a.add(70);
        a.add(30);
        a.add(60);
        a.add(20);
        a.add(40);
        a.add(15);
        a.add(70);
        System.out.println(a);
    }
}
