
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape
{
    int a;
    int b;
    int c;
    public Triangle(){
        
        super();
        
    }
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
       
    }
     double s = (a + b + c) / 2.0;
    public double getArea(){
        
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
                      
    }
    public double getPerimeter(){
     return a+b+c;   
    }
   
}
