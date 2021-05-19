public class Name_StarWars_CLIENT_SHELL
{
    public static void main()
    {
    Name n1 = new Name("Luke","R","Skywalker");
    Name n2= new Name("Anakin","E","Skywalker"); 
    Name n3 = n2;

        // Output n1-n3
        System.out.println("   n1 = " + n1);
        System.out.println("   n2 = " + n2);
        System.out.println("   n3 = " + n3);  
        System.out.println();
        
        // Fill array with names.
        Name names[] = {n1, n2, new Name("Leia","R","Skywalker"),
                        new Name("Han","R","Solo"), new Name("Kylo Ren","E","Solo"),
                        new Name("Yoda","R",""), new Name("R2D2","R","Droid"),
                        new Name("C3PO","R","Droid"), new Name("Chewbacca","R","Wookie"),
                        new Name("Darth","E","Vader"), new Name("Boba","E","Fett")
       };
       
         // call printList and output names array 
         System.out.println("Original List: ");
         printList(names);
         System.out.println("\n\n");         
 
         // sort list by last then first name
         System.out.println("Sorted List: ");         
         sortList(names);
         printList(names);
         System.out.println("\n\n");              
        
         System.out.println("Most common last name = " + mostCommonLastName(names));
         System.out.println("Shortest total name = " + shortestTotalName(names));
         System.out.println("Largest group in Names = " + largestMembersInNames(names));       
                
    } // main 
        
    // ===========================================================================
    // Print the entire array 
    public static void printList(Name names[])
    {
        // >>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<
        for (Name n: names) {
            System.out.println(n);
        }
    }
    // ===========================================================================
    // Sort the list by last/first name via BubbleSort
    public static void sortList(Name nameList[])
    {
        // >>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<   
        
        
    }
    
    // ===========================================================================
    // Return the most common last name found,null if none.If more than one exists
    //   common, pick the first one.
    public static String mostCommonLastName(Name list[])
    {
        // >>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<
    }
    
    // ==============================================================================
    // Find and return the Name that is the shortest in total.If more than one exists
    //   common, pick the first one.
    public static Name shortestTotalName(Name n[])
    {
        // >>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<
    }
    
    // ===========================================================================    
    // Return the group that has the largest number of members (R or E) 
    public static String largestMembersInNames(Name nl[])
    {
        // >>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<  
     
    }
    
}  // Name_StarWars_CLIENT
