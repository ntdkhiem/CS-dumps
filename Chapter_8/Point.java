import java.awt.*;
public class Point {
   public int x;
   public int y;

   public Point() {
       this(0,0);
   }

   public Point(int initializeX, int initializeY) {

       this.x = initializeX;
       this.y = initializeY;

       System.out.println("this = " + this.toString());

   }

   public Point(Point p) {
       this.x = p.x;
       this.y = p.y;
   }
   
   public void translate(int dx, int dy) {
       this.x += dx;
       this.y += dy;
   }
   
   public double distanceFromOrigin() {
       return Math.sqrt(x*x + y*y);
   }

   public int quadrant() {
       if (this.x == 0 || this.y == 0) {
           return 0;
       }
       if (this.x > 0) {
           return this.y > 0 ? 1 : 4;
       } 
       return this.y > 0 ? 2 : 3;
   }
   
   public void flip() {
       int tempX = this.x;
       this.x = this.y * -1;
       this.y = tempX * -1;
   }
   
   public int manhattanDistance(Point other) {
       return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
   }
   
   public boolean isVertical (Point other) {
       return this.x == other.x;
   }
   
   public double slope(Point other) {
       if (this.isVertical(other)) {
           throw new IllegalArgumentException();
       }
       return (other.y - this.y)/(other.x - this.x);
   }
   
   public boolean isCollinear(Point p1, Point p2) {
       if(this.x == p1.x && p1.x == p2.x || this.y == p1.y && p1.y == p2.y) {
           return true;
       }
       if (this.slope(p1) == p1.slope(p2)) {
           return true;
       }
       return false;
   }
   
   public double distance(Point other) {
       if (this.manhattanDistance(other) == 0) {
           return 0.0;
       }
       return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
   }
   
   public String toString() {
       return ("(" + x + "," + y + ")");    
   }
}

















