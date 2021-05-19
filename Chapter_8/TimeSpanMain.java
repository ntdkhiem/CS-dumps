public class TimeSpanMain {
    
    public static void main(){
        TimeSpan t1 = new TimeSpan(10, 52);
        
        //add
        t1.add(10,52);
        System.out.println(t1.toString());
        
        //subtract
        t1.subtract(1,0);
        System.out.println(t1.toString());
        
        //scale
        t1.scale(3);
        System.out.println(t1.toString());
    }
    
}