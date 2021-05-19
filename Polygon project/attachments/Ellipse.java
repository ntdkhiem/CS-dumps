public class Ellipse extends Rounds
{
    private double myRadius2;
    
    public Ellipse()
    {
    }

    public Ellipse(double radius, double radius2)
    {
        super(radius);
        setMyRadius2(radius2);
    }

    public void setMyRadius2(double radius2)
    {
        myRadius2 = radius2;
    }
    
    public double getMyRadius2()
    {
        return myRadius2;
    }
    
    public void calculateArea()
    {
        setMyArea(Math.PI * (getMyRadius() * getMyRadius()));
    }

    public String getMyType()
    {
        return "Ellipse";
    }

    public String toString()
    {
        return "Ellipse and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
