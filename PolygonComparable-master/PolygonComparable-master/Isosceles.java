
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
