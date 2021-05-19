public class Circle extends Rounds
{       
    public Circle()
    {
    }
    
    public Circle(double radius)
    {
        super(radius);
    }
   
    public void calculateArea()
    {
        setMyArea(Math.PI * (getMyRadius() * getMyRadius()));
    }
    
    public String getMyType()
    {
        return "Circle";
    }
    
    public String toString()
    {
        return "Circle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
