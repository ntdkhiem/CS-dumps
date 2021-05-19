import java.util.*;
public class Person_Comparable_Dates_CLIENT_SHELL
{

    public static void main()
    {
        ArrayList<Person_Comparable_Dates> people = new ArrayList<Person_Comparable_Dates>();
        Person_Comparable_Dates theOldest, theYoungest;

        people.add(new Person_Comparable_Dates("George","Washington", 2, 22, 1732));
        people.add(new Person_Comparable_Dates("Paul","Marques",3,27,1969));
        people.add(new Person_Comparable_Dates("Kermit","The Frog",9,27,1976));
        people.add(new Person_Comparable_Dates("SquarePants","SpongeBob",5,1,1999));
        people.add(new Person_Comparable_Dates("Charlie","Brown",10,3,1950));
        people.add(new Person_Comparable_Dates("Rocky","Horror",8,14,1975));
        people.add(new Person_Comparable_Dates("Moses","RedSea",4,3,-2345));
        people.add(new Person_Comparable_Dates("Isaac","Newton",1,4,1643));
        people.add(new Person_Comparable_Dates("William","Shakespeare",4,26,1564));
        people.add(new Person_Comparable_Dates("Oprah","Winfrey",1,29,1954));

        theOldest = findOldest(people);
        theYoungest = findYoungest(people);

        System.out.println("The list of people are: \n" + people + "\n");        
        System.out.println(" The oldest Person_Comparable_Dates: " + theOldest + "\n");
        System.out.println(" The youngest Person_Comparable_Dates: " + theYoungest);

    } // main

    public static Person_Comparable_Dates findOldest(ArrayList<Person_Comparable_Dates> Person_Comparable_DatesList)
    {
        Person_Comparable_Dates oldest = Person_Comparable_DatesList.get(0); 
        for (int i = 1; i < Person_Comparable_DatesList.size(); i++)
        {
            if (oldest.compareTo(Person_Comparable_DatesList.get(i)) > 0)
            {
                oldest = Person_Comparable_DatesList.get(i);
            }
        }
        return oldest;
    } // findOldest

    public static Person_Comparable_Dates findYoungest(ArrayList<Person_Comparable_Dates> Person_Comparable_DatesList)
    {
        Person_Comparable_Dates youngest = Person_Comparable_DatesList.get(0); 
        for (int i = 1; i < Person_Comparable_DatesList.size(); i++)
        {
            if (youngest.compareTo(Person_Comparable_DatesList.get(i)) < 0)
            {
                youngest = Person_Comparable_DatesList.get(i);
            }
        }
        return youngest;
    } // findYoungest

}
