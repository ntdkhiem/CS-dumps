public class SemiCircle extends Circle
{
    public SemiCircle()
    {
    }
    
    public SemiCircle(double radius)
    {
        super(radius);
    }
   
    public void calculateArea()
    {
        setMyArea((Math.PI * (getMyRadius() * getMyRadius())) / 2.0);
    }
    
    public String getMyType()
    {
        return "SemiCircle";
    }
    
    public String toString()
    {
        return "SemiCircle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
