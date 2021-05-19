public class Rhombus extends Parallelogram
{
    public Rhombus()
    {
    }

    public Rhombus(double base1, double base2, double height)
    {
        super(base1, base2, height);
    }

    public void calculateArea()
    {
        super.setMyArea(getMyBase1() * getMyHeight());
    }

    public String getMyType()
    {
        return "Rhombus";
    }

    public String toString()
    {
        return "Rhombus and I am also a " + super.toString();
    }
}
