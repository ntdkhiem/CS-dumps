import java.util.*;
public class Fruit_CLIENT
{
   public static void main() {
       ArrayList<Fruit> bananas = new ArrayList<Fruit>();
       bananas.add(new ManzanoBanana());
       bananas.add(new BabyBanana());
       bananas.add(new BurroBanana());
       System.out.println("============= Bananas =============");
       for (Fruit banana: bananas) {
           System.out.println(banana);
       }
       
       ArrayList<Fruit> apples = new ArrayList<Fruit>();
       apples.add(new HoneycrispApple());
       apples.add(new GalaApple());
       apples.add(new FujiApple());
       System.out.println("============= Apples =============");
       for (Fruit apple: apples) {
           System.out.println(apple);
       }
   }
}
