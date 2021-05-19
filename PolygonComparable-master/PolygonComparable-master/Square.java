public class Square extends Rectangle
{
    public Square()
    {
    }

    public Square(double base1, double base2, double height)
    {
        super(base1, base2, height);
    }

    public void calculateArea()
    {
        super.setMyArea(getMyBase1() * getMyBase1());
    }

    public String getMyType()
    {
        return "Square";
    }

    public String toString()
    {
        return "Square and I am also a " + super.toString();
    }
}