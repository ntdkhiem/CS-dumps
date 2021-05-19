/**
 * (1) Have the Equilateral class extend Triangles.  
 * (2) Write 2 constructors:  (a) the default that calls the super classes default 
 *     constructor and (b) One that takes in 2 doubles representing the base and 
 *     the height.  It should then call the super classes constructor with these 
 *     2 arguments.
 * (3) Override the method getMyType() that returns "Equilateral"
 */

public class Equilateral extends Triangle
{  

    // Constructors
    public Equilateral()
    {
    }
    
    public Equilateral(double base, double height)
    {
        super(base, height);
    }
    
    // Overide abstract method    
    public String getMyType()
    {
        return "Equilateral";
    }
          
    public String toString()
    {
        return "Equilateral and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
