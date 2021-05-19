
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    int radius;
    public Circle(){
        
       super();
       int radius = 0;
    }
    public Circle(int radius){
     this.radius = radius;
     
        
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2.0 * Math.PI * radius;
    }
    
    }

