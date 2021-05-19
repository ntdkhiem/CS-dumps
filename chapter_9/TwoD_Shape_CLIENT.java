import java.text.DecimalFormat;
public class TwoD_Shape_CLIENT
{  
    public static void main()
    {
     DecimalFormat df = new DecimalFormat("####.000");        
     Shape[] shapes = new Shape[4];
     shapes[0] = new Rectangle(18, 18);
     shapes[1] = new Triangle(30, 30, 30);
     shapes[2] = new Circle(12);
     shapes[3] = new SemiCircle(12);
     
     String shapeNames[] = {"Rectangle","Triangle","Circle","SemiCircle"};
      
         for (int i = 0; i < shapes.length; i++) 
         {
             System.out.println(shapeNames[i] + ": area = " + df.format(shapes[i].getArea()) +
                                    ", perimeter = " + df.format(shapes[i].getPerimeter()));
         }
     } // main
 
}  // TwoD_Shape_CLIENT
