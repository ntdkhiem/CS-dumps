import java.util.*;

public class studentLetterGradeComparator implements Comparator<Student> {
    public int compare (Student stu1, Student stu2) {
        return stu1.letterGrade - stu2.letterGrade;
    }
}