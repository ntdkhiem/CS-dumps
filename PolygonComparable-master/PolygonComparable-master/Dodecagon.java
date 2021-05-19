public class Dodecagon extends Agon
{    
    public Dodecagon()
    {
    }
    
    public Dodecagon(double sideLength)
    {
        super(12, sideLength);
    }
      
    public String getMyType()
    {
        return "Dodecagon";
    }
    
    public String toString()
    {
        return "Dodecagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
