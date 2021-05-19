import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    public int compare(Employee obj1, Employee obj2) {
        return obj1.ss.compareTo(obj2.ss);
    }
}