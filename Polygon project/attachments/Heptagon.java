public class Heptagon extends Agon
{    
    public Heptagon()
    {
    }
    
    public Heptagon(double sideLength)
    {
        super(7, sideLength);
    }
      
    public String getMyType()
    {
        return "Heptagon";
    }
    
    public String toString()
    {
        return "Heptagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
