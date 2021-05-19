public class Octagon extends Agon
{    
    public Octagon()
    {
    }
    
    public Octagon(double sideLength)
    {
        super(8, sideLength);
    }
      
    public String getMyType()
    {
        return "Octagon";
    }
    
    public String toString()
    {
        return "Octagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
