/**
 * Building Java Programs 3rd Edition.
 * Section 9.1 end
 
TwoD_Shape_CLIENT: 

 * Write the Shapes superclass and the 3 subclasses that will work in sync 
 * with the main() code and the followiing specifics:
 * 
 * (1) Use the main() given below and MATCH the output given.
 * (2) Use the following specifics (what it 'has') for the given classes.
 * 
 * Shape:
 *   - Superclass to Rectangle, Triangle, Circle
 *   - Has a No-Argument constructor
 *   - Has 2 dummy accessor methods [get( )] that do not have real meaningful values:
 *      - getArea( ) that returns 0.0
 *      - getPerimeter( ) that returns 0.0
 *  
 * Rectangle:
 *   - Is a subclass of Shape
 *   - 2 instance variables both of type double: width & height
 *   - Has 2 constructors: 
 *      - No-Argument constructor that sets the instance variables to 0.0
 *      - 2 parameter constructor that takes in the width & height and sets 
 *        the instance variables accordingly.
 *      - getArea() that returns the area of the rectangle: width * height
 *      - getPerimeter( ) that returns the perimeter of the rectangle: 2*width + 2*height
 * 
 * Triangle:
 *   - Is a subclass of Shape
 *   - 3 instance variables all of type double: a, b, c 
 *   - Has 2 constructors: 
 *      - No-Argument constructor that sets the instance variables to 0.0
 *      - 3 parameter constructor that takes in a, b, c and sets 
 *        the instance variables accordingly.
 *      - getArea() that returns the area of the triangle:
 *         Triangle's area = Math.sqrt(s * (s - a) * (s - b) * (s - c)) 
 *                     with s = (a + b + c) / 2.0;
 *      - getPerimeter( ) that returns the perimeter of the rectangle: a + b + c
 *      
 * Circle:
 *   - Is a subclass of Shape
 *   - 1 instance variables of type double: radius
 *   - Has 2 constructors: 
 *      - No-Argument constructor that sets the instance variable to 0.0
 *      - 1 parameter constructor that takes in the radius and sets 
 *        the instance variable accordingly.
 *      - getArea() that returns the area of the circle: Math.PI * radius * radius;
 *      - getPerimeter( ) that returns the perimeter of the circle: 2.0 * Math.PI * radius;   

 *      
 * SemiCircle:
 *   - Is a subclass of Circle
 *   - Has 2 constructors: 
 *      - No-Argument constructor that sets the instance variable to 0.0
 *      - 1 parameter constructor that takes in the radius and sets 
 *        the instance variable accordingly via its super class.
 *      - getArea() that returns the area of the semicircle: 0.5 * (Math.PI * radius * radius;)
 *      - getPerimeter( ) that returns the perimeter of the semicircle: 0.5 * (2.0 * Math.PI * radius)         
 *      
TwoD_Shape_CLIENT:               
OUTPUT:
Rectangle: area = 324.000, perimeter = 72.000
Triangle: area = 389.711, perimeter = 90.000
Circle: area = 452.389, perimeter = 75.398
SemiCircle: area = 226.195, perimeter = 37.699

*/


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

