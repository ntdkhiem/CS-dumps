
/**
 * Write a description of class SemiCircle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SemiCircle extends Circle
{
    // instance variables - replace the example below with your own
     int radius;

    
    public SemiCircle()
    {
        super();
      
    }
    public SemiCircle(int radius){
        this.radius = radius;
    }
    public double getArea(){
     return super.getArea()/2;   
    }
    public double getPerimeter(){
        return super.getPerimeter()/2;
    }
   
}
