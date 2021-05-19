import java.util.*;
public class LastCharacterOrderComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1);
    }
}