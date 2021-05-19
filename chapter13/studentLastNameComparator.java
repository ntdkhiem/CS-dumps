import java.util.*;
public class studentLastNameComparator implements Comparator<Student>
{
    public int compare (Student stu1, Student stu2) {
        return stu1.lastName.compareTo(stu2.lastName);
    }
}
