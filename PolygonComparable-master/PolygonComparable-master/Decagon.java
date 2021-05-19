public class Decagon extends Agon
{    
    public Decagon()
    {
    }
    
    public Decagon(double sideLength)
    {
        super(10, sideLength);
    }
      
    public String getMyType()
    {
        return "Decagon";
    }
    
    public String toString()
    {
        return "Decagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
