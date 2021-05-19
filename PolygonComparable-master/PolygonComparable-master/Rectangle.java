public class Rectangle extends Parallelogram
{
    public Rectangle()
    {
    }
    
    public Rectangle(double base1, double base2, double height)
    {
        super(base1, base2, height);
    }
    
    public void calculateArea()
    {
        super.setMyArea(getMyBase1() * getMyHeight());
    }
    
    public String getMyType()
    {
        return "Rectangle";
    }
    
    public String toString()
    {
        return "Rectangle and I am also a " + super.toString();
    }
}
