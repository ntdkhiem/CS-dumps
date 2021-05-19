public class Trapezoid extends Quadrilaterals
{
    public Trapezoid()
    {
    }

    public Trapezoid(double base1, double base2, double height)
    {
        super(base1, base2, height);
    }

    public void calculateArea()
    {
        super.setMyArea(((getMyBase1() + getMyBase2()) / 2.0) * getMyHeight());
    }

    public String getMyType()
    {
        return "Trapezoid";
    }

    public String toString()
    {
        return "Trapezoid and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
