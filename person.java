import java.util.Objects;

public class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(person a) {
        if (this == a)
            return true;
        if (a == null || getClass() != a.getClass())
            return false;
        return this.name == a.name && this.age == a.age;
    }
}

class Equalsmethod {
    public static void main(String[] args) {
        /*
         * Integer a = 10;
         * Integer b = 10;
         * System.out.println(a == b);
         * System.out.println(a.equals(b));
         * 
         * Integer c = 200;
         * Integer d = 200;
         * System.out.println(c == d);
         * System.out.println(c.equals(d));
         * 
         * String x = "Gayathri";
         * String y = "Gayathri";
         * System.out.println(x == y);
         * System.out.println(x.equals(y));
         * 
         * String s = new String("Shal");
         * String t = new String("Shal");
         * System.out.println(s == t);
         * System.out.println(s.equals(t));
         */
        Integer a = 10;
        Integer b = 10;

        person e = new person("gayathri", 18);
        person f = new person("gayathri", 20);
        System.out.println(e == f);
        System.out.println(e.equals(e));
        // System.out.println(Objects.equals(e, f));
        System.out.println(e.getClass());
        System.out.println(e.hashCode());
        System.out.println(a.parseInt("100"));
        System.out.println(a.toString(18));
        System.out.println(a.MAX_VALUE);
        System.out.println(a.SIZE);
        System.out.println(Integer.max(a, b));
        System.out.println(a.valueOf("100"));
    }
}
