import java.util.Scanner;

public class Employee extends NameComparator {
    public String firstName, lastName, middleInitial, ss, title, category;

    public Employee() {
        firstName = lastName = middleInitial = ss = title = category = null;
    }

    public Employee(String f, String l, String m, String s, String t, String c) {
        firstName = f;
        lastName = l;
        middleInitial = m;
        ss = s;
        title = t;
        category = c;
    }

    // Precondition: "last first mid social-number category title"
    public Employee(String line) {
        // System.out.println(line);
        Scanner c = new Scanner(line);
        lastName = c.next();
        firstName = c.next();
        middleInitial = c.next();
        ss = c.next();
        category = c.next();
        // add everything else as a title
        title = c.next();
        while (c.hasNext()) {
            title += c.next();
        }
        c.close();
    }

    public String toString() {
        return "(" + lastName + " " + firstName + " " + middleInitial + "  " + ss + "  " + title + ")";
    }
}