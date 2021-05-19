import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    public int compare(Employee obj1, Employee obj2) {
        // last name
        int ln = obj1.lastName.compareTo(obj2.lastName);
        if (ln == 0) {
            // first name
            int fn = obj1.firstName.compareTo(obj2.firstName);
            if (fn == 0) {
                // middle name
                return obj1.middleInitial.compareTo(obj2.middleInitial);
            }
            return fn;
        }
        return ln;
    }
}