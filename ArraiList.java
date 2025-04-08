import java.util.ArrayList;

public class ArraiList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(70);
        a.add(90);
        a.add(100);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        a.remove(2);
        a.add(100);
        a.add(100);
        a.add(null);
        a.set(3, 40);
        System.out.println(a.equals(90));
        System.out.println(a);
        System.out.println(a.remove(10));
    }
}