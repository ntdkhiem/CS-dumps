public class Pentagon extends Agon
{    
    public Pentagon()
    {
    }
    
    public Pentagon(double sideLength)
    {
        super(5, sideLength);
    }
      
    public String getMyType()
    {
        return "Pentagon";
    }
    
    public String toString()
    {
        return "Pentagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
