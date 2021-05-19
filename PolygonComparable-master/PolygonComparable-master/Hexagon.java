public class Hexagon extends Agon
{    
    public Hexagon()
    {
    }
    
    public Hexagon(double sideLength)
    {
        super(6, sideLength);
    }
      
    public String getMyType()
    {
        return "Hexagon";
    }
    
    public String toString()
    {
        return "Hexagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}