
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
  int width;
  int length;
  public Rectangle(){
      
      super();
      
    }
    public Rectangle(int width, int height){
     this.width = width;
     this.length = length;
     
    }
    public double getArea(){
     return length * width;
    }
    public double getPerimeter(){
        return (length*2) + (width *2);
    }
}
