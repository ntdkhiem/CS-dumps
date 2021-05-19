import java.util.*;
public class studentFirstNameComparator implements Comparator<Student>
{
    public int compare (Student stu1, Student stu2) {
        return stu1.firstName.compareTo(stu2.firstName);
    }
}
