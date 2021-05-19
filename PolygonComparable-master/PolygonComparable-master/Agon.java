 
public abstract class Agon implements Polygon_Comparable
{
    // Instance variables
    double mySideLength, myArea;
    final int MY_NUM_SIDES;

    // *********** Constructors ****************
    public Agon()
    {
        this(0,0);
    }
    
    public Agon(int sides, double sideLength)
    {
        MY_NUM_SIDES = sides;
        setMySideLength(sideLength);
    }

    // ************ abstract method(s) & the overiding of such ************
    public String getMyCategory()
    {
        return "Agon";
    }

    // ********************* Assessor and Mutator methods *************************
    public double getMyArea()
    {
        calculateArea();  // Always calculateArea() first.
        return myArea;
    }

    public double getMyNumSides()
    {
        return MY_NUM_SIDES;
    }

    public double getMySideLength()
    {
        return mySideLength;
    }

    public void setMySideLength(double s)
    {
        mySideLength = s;
    }

    public void calculateArea()
    {
        myArea = 1.0/4 * MY_NUM_SIDES * Math.pow(mySideLength,2) * (1.0/ Math.tan(Math.PI / MY_NUM_SIDES));
    }

    // ************************* compareTo() *************************************
    public int compareTo(Polygon_Comparable other)
    {
        if (this.getMyArea() > other.getMyArea())
            return 1;
        else if (this.getMyArea() < other.getMyArea())
            return -1;
        else
            return 0;
    }

    // ************************** toString() ******************************
    public String toString() 
    { 
        return "Agon and I am also a Polygon_Comparable";
    }    

}
