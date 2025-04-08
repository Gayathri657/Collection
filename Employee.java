import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    int ID;
    String name;

    Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int compareTo(Employee a) {
        if (this.ID > a.ID)
            return 1;
        else
            return -1;
    }

    public String toString() {
        return "Employee[ID=" + ID + ", Name=" + name + "]";
    }

}

class Collections1 {
    public static void main(String[] args) {

        ArrayList<Employee> E = new ArrayList<>();
        E.add(new Employee(1, "Gayathri"));
        E.add(new Employee(2, "Shal"));
        E.add(new Employee(6, "afrst"));
        E.add(new Employee(8, "hgwh"));
        
        Comparator<Employee> nameComparator = Comparator.comparing(emp -> emp.name);
        Collections.sort(E, nameComparator); 

        // Now perform binary search
        int index = Collections.binarySearch(E, new Employee(0, "Gayathri"), nameComparator);
        System.out.println(index);

        System.out.println(E);
    }

}