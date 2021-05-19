

public class Scalene extends Triangle
{  

    // Constructors
    public Scalene()
    {
    }
    
    public Scalene(double base, double height)
    {
        super(base, height);
    }
    
    // Overide abstract method    
    public String getMyType()
    {
        return "Scalene";
    }
          
    public String toString()
    {
        return "Scalene and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}
