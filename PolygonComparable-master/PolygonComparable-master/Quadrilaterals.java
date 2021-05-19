public abstract class Quadrilaterals implements Polygon_Comparable
{
    // instance variables
    double myBase1, myBase2, myHeight, myArea;

    // ---------------------- constructor ---------------------
    public Quadrilaterals()
    {
    }
    
    public Quadrilaterals(double base1, double base2, double height)
    {
        setMyBase1(base1);
        setMyBase2(base2);
        setMyHeight(height);
    }

    // ************ abstract method(s) & the overiding of such *************
    public String getMyCategory()
    {
        return "Rectangle";
    }

    // ********************* Assessor and Mutator methods *************************
    public void setMyBase1(double b1)
    {
        myBase1 = b1;
    }

    public void setMyBase2(double b2)
    {
        myBase2 = b2;
    }    

    public void setMyHeight(double h)
    {
        myHeight = h; 
    }

    public void setMyArea(double a)
    {
        myArea = a;
    }

    public double getMyBase1()
    {
        return myBase1;
    }

    public double getMyBase2()
    {
        return myBase2;
    }

    public double getMyHeight()
    {
        return myHeight;
    }    

    public double getMyArea()
    {
        calculateArea();  // Always calculateArea() first.
        return myArea;
    }

    // ******* abstract method calculateArea() to be overriden written here:
    // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<    

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
        return "Quadrilateral and I am also a Polygon_Comparable";
    }      

}
