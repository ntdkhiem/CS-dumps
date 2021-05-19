 // ======================================================================
 

//package Line;

/**
 * Building Java Programs
 * 2nd Edition
 * Chapter 8
 * Line Ex#9-12
 * 

 OUTPUT:
    Line - Exercise #9:
line1.getP1() = (1,1)
line1.getP2() = (7,5)
line1 = [(1,1), (7,5)]

    Line - Exercise #10:
line1.getSlope() = 0.6666666666666666

    Line - Exercise #11:
line2 = [(2,2), (2,10)]
line2 = [(3,7), (10,7)]

    Line - Exercise #12:
  These isCollinear ones SHOULD work:
line1.isCollinear(p1)) = true
line2.isCollinear(p2)) = true
line3.isCollinear(p3)) = true
  These isCollinear ones should NOT work:
line1.isCollinear(p4)) = false
line2.isCollinear(p4)) = false
line3.isCollinear(p4)) = false

 */

public class Line_CLIENT
{

    public static void main()
    {     
      
        // Ex 9
        System.out.println("    Line - Exercise #9:");
        Line line1 = new Line(new Point(1,1), new Point(7,5));
        System.out.println("line1.getP1() = " + line1.getP1());
        System.out.println("line1.getP2() = " + line1.getP2());
        System.out.println("line1 = " + line1.toString());
        System.out.println();

        // Ex 10
        System.out.println("    Line - Exercise #10:");        
        System.out.println("line1.getSlope() = " + line1.getSlope());
        System.out.println();
        
        // Ex 11
        System.out.println("    Line - Exercise #11:");        
        Line line2 = new Line(2,2,2,10);
        Line line3 = new Line(3,7,10,7);
        System.out.println("line2 = " + line2.toString());
        System.out.println("line3 = " + line3);      
        System.out.println();        
        
        // Ex 17
        System.out.println("    Line - Exercise #17:");        
        Point p1 = new Point(4,3);
        Point p2 = new Point(2,5);
        Point p3 = new Point(15,7);   
        Point p4 = new Point(10,10);       
        System.out.println("  These isCollinear ones SHOULD work:");
        System.out.println("line1.isCollinear(p1)) = " + line1.isCollinear(p1));
        System.out.println("line2.isCollinear(p2)) = " + line2.isCollinear(p2));
        System.out.println("line3.isCollinear(p3)) = " + line3.isCollinear(p3));               
        System.out.println("  These isCollinear ones should NOT work:");
        System.out.println("line1.isCollinear(p4)) = " + line1.isCollinear(p4));
        System.out.println("line2.isCollinear(p4)) = " + line2.isCollinear(p4));
        System.out.println("line3.isCollinear(p4)) = " + line3.isCollinear(p4));
        System.out.println();   
        
    }  // main
    
}  // Line_CLIENT
