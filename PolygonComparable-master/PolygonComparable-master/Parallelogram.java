public class Parallelogram extends Trapezoid
{
    public Parallelogram()
    {
    }
    
    public Parallelogram(double base1, double base2, double height)
    {
        super(base1, base2, height);
    }
    
    public void calculateArea()
    {
        super.setMyArea(getMyBase1() * getMyHeight());
    }
    
    public String getMyType()
    {
        return "Parallelogram";
    }
    
    public String toString()
    {
        return "Parallelogram and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
