/**
 * (1) Have the Isosceles class extend Triangles.  
 * (2) Write 2 constructors:  (a) the default that calls the super classes default 
 *     constructor and (b) One that takes in 2 doubles representing the base and 
 *     the height.  It should then call the super classes constructor with these 
 *     2 arguments.
 * (3) Override the method getMyType() that returns "Isosceles"
 */

public class Isosceles extends Triangle
{  

    // Constructors
    public Isosceles()
    {
    }
    
    public Isosceles(double base, double height)
    {
        super(base, height);
    }
    
    // Overide abstract method    
    public String getMyType()
    {
        return "Isosceles";
    }
          
    public String toString()
    {
        return "Isosceles and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
