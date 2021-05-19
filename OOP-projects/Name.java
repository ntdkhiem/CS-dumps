public class Name
{
public String firstName;
public String middleInitial;
public String lastName;
    
    public Name()
    {
        this("","","");
    }

    public Name(String first, String last)
    {
        this(first,"",last);
    }
    public Name(String first, String middle, String last)
    {
        firstName = first;
        middleInitial = middle;
        lastName = last;
    }

    public String toString()
    {
        return lastName + " " + middleInitial + " " + firstName;
    }
    
}