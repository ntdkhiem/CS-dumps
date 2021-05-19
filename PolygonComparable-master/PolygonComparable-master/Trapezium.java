public class Trapezium extends Quadrilaterals
{
    public Trapezium()
    {
    }
    
    public Trapezium(double base1, double base2, double height)
    {
        super(base1, base2, height);
    }
    
    public void calculateArea()
    {
        super.setMyArea(((getMyBase1() + getMyBase2()) / 2.0) * getMyHeight());
    }
    
    public String getMyType()
    {
        return "Trapezium";
    }
    
    public String toString()
    {
        return "Trapezium and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
