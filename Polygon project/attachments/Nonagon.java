public class Nonagon extends Agon
{    
    public Nonagon()
    {
    }
    
    public Nonagon(double sideLength)
    {
        super(9, sideLength);
    }
      
    public String getMyType()
    {
        return "Nonagon";
    }
    
    public String toString()
    {
        return "Nonagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
