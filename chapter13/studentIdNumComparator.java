import java.util.*;

public class studentIdNumComparator implements Comparator<Student> {
    public int compare (Student stu1, Student stu2) {
        return stu1.idNum.compareTo(stu2.idNum);
    }
}