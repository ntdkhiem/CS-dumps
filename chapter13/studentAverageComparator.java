import java.util.*;

public class studentAverageComparator implements Comparator<Student> {
    public int compare (Student stu1, Student stu2) {
        return (int) (stu1.average * 10) - (int) (stu2.average * 10);
    }
}