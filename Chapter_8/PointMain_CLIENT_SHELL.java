 

public class PointMain_CLIENT_SHELL
{
    public static void main()
    {
/* Step 1: {Begin} Point is public */        
    // A program that deals with points. 
    // First version, to accompany Point class with state only. 
    // create two Point objects.
    // Pg 523:
        Point p1 = new Point(); 
        p1.x = 7; 
        p1.y = 2;    
        
        Point p2 = new Point(); 
        p2.x = 4; 
        p2.y = 3; 
    //Point p2 = new Point(4,3);     
 
    Point p3 = new Point();   
    
    // print out each point's hexadecimal memory address/address
    // of where it is located in RAM (random access memory)
    System.out.println("Each Point's hexadecimal memory address:");
    System.out.println("p1 = " + p1);
    System.out.println("p2 = " + p2);    
    System.out.println();    
  

    // Pg 523 continued:
    // print each point and its distance from the origin 
    System.out.println("p1 is (" + p1.x + ", " + p1.y + ")"); 
    double dist1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y); 
    System.out.println("distance from origin = " + dist1); 
 
    System.out.println("p2 is (" + p2.x + ", " + p2.y + ")"); 
    double dist2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y); 
    System.out.println("distance from origin = " + dist2); 
    System.out.println(); 

/*
    // Pg 526: translate each point to a new location 
    p1.translate(11,6);
    p2.translate(1,7);
    // print the points again
    System.out.println("p1 after translate(11,6) = " + "(" + p1.x + ", " + p1.y + ")");
    System.out.println("p2 after translate(1,7) = " + "(" + p2.x + ", " + p2.y + ")");   
 */

/* 
   // Pg 530: print each point and its distance from the origin
    System.out.println("p1 = " + p1);
    System.out.println("Distance from origin = " + p1.distanceFromOrigin());
    System.out.println("p2 = " + p2);
    System.out.println("Distance from origin = " + p2.distanceFromOrigin());
    System.out.println();
*/    

/*
    // Pg 531: Printing out the Points via our "USER Defined" toString() method    
    System.out.println("p1 = " + p1.toString());
    System.out.println("p2 = " + p2);    
*/
  
/*        
    // Pg 566 Exercise #1: Tell what Quadrant the points are in.
    System.out.println("\n");    
    System.out.println("p1 lies in Quadrant " + p1.quadrant());
    System.out.println("p2 lies in Quadrant " + p2.quadrant());
*/
    
 /*   
    // Pg 566 Exercise #2: Flip the X and Y coordinates in each point.
    p1.flip();
    p2.flip();
    // Output the results
    System.out.println("\n");    
    System.out.println("p1 FLIPED = " + p1);
    System.out.println("p2 FLIPED = " + p2);
*/    
    // Pg 566 Exercise #3: MahattanDistance
    System.out.println("\n");
    System.out.println("The Manhattan Distance between" + p1
        + " and " + p2 + " = " + p1.manhattanDistance(p2));
       
    // Pg 566 Exercise #4: isVerticle
    System.out.println("\n");
    System.out.println("is p1 = " + p1
        + " vertical with p2 = " + p2 + " --> " + p1.isVertical(p2));
    
    // Pg 566 Exercise #5: slope
    System.out.println("\n");
    System.out.println("The slope between" + p1
        + " and " + p2 + " = " + p1.manhattanDistance(p2));
    
    // Pg 566 Exercise #6: isCollinear
    // pg 565 Self Check #10: distance
    System.out.println("\n");
    System.out.println("The Distance between" + p1
        + " and " + p2 + " = " + p1.manhattanDistance(p2));
/*   
    
     
 */

  }  // main
}  // PointMain_CLIENT


