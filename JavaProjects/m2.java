import java.util.*;
public class m2 {
    public static void main() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        t(list);
    }
    public static void t(ArrayList<Integer> list) {
        list.set(2,5);
        System.out.println(list);
    }
}