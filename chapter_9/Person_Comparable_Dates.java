// ==============================================

/**
 * Person_Comparable_Dates class does the following:
 * 
 *  (1) implements "Comparable" and thus, YOU write the "compareTo()" method.
 *                    Rem:  public int compareTo(Object x)
 *                    
 *  (2) has the needed instance variables: myFirstName & myLastName of type String,
 *                                         myBirthDate of type Date (Compositioned inside of Person
 *                                                                   in other words, Person "hasA" Date)  
 *  (3) has the needed constructors: default and regular that takes in 2 Strings for the name &
 *                                   3 ints for the Date object.
 *                                   
 *  (4) has getMyBirthDate() that returns the Person's myBirthDate. 
 *  
 *  (5) has a toString() method
 *  
*/

// >>>>>>>>>>>>>>>>>>  YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<<<<<<

public class Person_Comparable_Dates implements Comparable
{
    public String myFirstName, myLastName;
    public Date myBirthDate;
    
    public Person_Comparable_Dates()
    {
    }
    
    public Person_Comparable_Dates(String firstName, String lastName, int month, int day, int year)
    {
        this.myFirstName = firstName;
        this.myLastName = lastName;
        this.myBirthDate = new Date(month, day, year);
    }
    
    public int compareTo(Object x)
    {
        if (x instanceof Person_Comparable_Dates)
        {
            if(this.myBirthDate.getYear() > ((Person_Comparable_Dates)x).myBirthDate.getYear())
            {
                return 1;
            }
            else if(this.myBirthDate.getYear() == ((Person_Comparable_Dates)x).myBirthDate.getYear())
            {
                return 0;
            }
            else 
            {
                return -1;
            }
        }
        return -1;
    }
    
    public Date myBirthDate()
    {
        return this.myBirthDate();
    }
    
    public String toString()
    {
        return this.myLastName + " " + this.myFirstName + " " + this.myBirthDate;
    }
}


// ======================================================================


/**
 *  Person_Comparable_Dates_Dates_Dates_CLIENT:
 * Mr. Marques
 * 
 * This program will help you to understand how the interface Comparable works.
 * Remember, it is a Java "built-in" interface that has one and only one method 
 * that you MUST override.  
 *      
 *          It is ALWAYS of the form:
 *          
 *             public int compareTo(Object x) // It ALWAYS takes in an 'Object' and
 *                                            // returns an 'int'. ALWAYS!!!
 *                                            // Remember this!!
 * 
 *   This program will have you write a Person_Comparable_Dates class that creates an ArrayList called 'people' 
 *   that holds the type 'Person_Comparable_Dates'.  A 'Person_Comparable_Dates' has a firstName and lastName as well as it hasA
 *   Date class that holds the Person_Comparable_Datess birthdate.  
 *   
 *   Your task:  Find the youngest and oldest Person_Comparable_Dates in the ArrayList 'people'. Create the 
 *   'Person_Comparable_Dates' class and have it "implement" Comparable.  Thus, you have to write the compareTo()
 *   method for Person_Comparable_Dates that compares each 'Person_Comparable_Dates' first by year, then month, then day.
 *   
 *   
 */
