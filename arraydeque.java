import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque b = new ArrayDeque(5);
        b.add(10);
        b.add(20);
        b.add(30);
        b.add(60);
        b.poll();
        b.add(80);
        b.add(100);
        System.out.println(b.get(2));

    }
}
