import java.util.LinkedList;

public class Linkedlist {
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList b = new LinkedList();
        b.add(10);
        b.add(20);
        b.add(30);
        b.add(60);
        b.add(80);
        b.add(90);
        b.add(10);
        b.add(10);
        b.add(null);
        System.out.println(b.get(2));
        System.out.println(b.offer(10));
        System.out.println(b);
        System.out.println("This " + b.removeFirst());
        System.out.println(b.pollFirst());
        System.out.println(b);
        System.out.println(b.peekFirst());
        System.out.println("This is after peek" + b);
        System.out.println(b.remove());

    }
}
