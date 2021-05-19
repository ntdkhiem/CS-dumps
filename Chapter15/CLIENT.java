public class CLIENT
{
    public static void main() {
        ArrayIntList list = new ArrayIntList(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        ArrayIntList list2 = new ArrayIntList(3);
        list2.add(4);
        list2.add(5);
        list2.add(1);
        System.out.println(list.indexOfSubList(list2));
    }
}
