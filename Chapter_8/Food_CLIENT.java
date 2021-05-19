public class Food_CLIENT
{
    public static void main() {
        Food apple = new Food("Apple", "fruit", true, 35.92 );
        System.out.println(apple);
        Food banana = new Food("Banana", "fruit",true, 45.92 );
        System.out.println(banana);
        Food acid = new Food("Acid", "acid",false, 0 );
        System.out.println(acid);
    }
}
