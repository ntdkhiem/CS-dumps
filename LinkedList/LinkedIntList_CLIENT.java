
/**
 * Building Java Programs
 * 3rd Edition
 * Chapter 16.2: LinkedIntList_CLIENT
 */

public class LinkedIntList_CLIENT
{
    public static void main()
    {
        // Create the LinkedIntList 
        System.out.println("  Create the Zero-Indexed LinkedIntList");
        LinkedIntList lil = new LinkedIntList();
        System.out.println("\n");
        /*
        // pg 967 SIZE of LinkedIntList
        System.out.println(" SIZE of Empty LinkedIntList: lil.size() = " + lil.size());
        System.out.println("\n");        

        // ADD to the LinkedIntList
        System.out.println(" ADD 10 - 50 to LinkedIntList lil");
        lil.add(10); 
        lil.add(20);     
        lil.add(30); 
        lil.add(40);
        lil.add(50); 

        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");           

        // SIZE of newly filled LinkedIntList
        System.out.println(" SIZE of LinkedIntList: lil.size() = " + lil.size());        
        System.out.println("\n");     

        // ADD to the LinkedIntList
        System.out.println(" ADD 31 to LinkedIntList lil at 4th position (Rem: Zero based indexing");
        lil.add(3,31); 
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");                   
        // SIZE of newly filled LinkedIntList
        System.out.println(" SIZE of LinkedIntList lil = " + lil.size());        
        System.out.println("\n");  

        // Pg : INDEX in the LinkedIntList
        System.out.println(" INDEX of 31 in LinkedIntListlil = " + lil.indexOf(31));
        System.out.println("\n");          

        // pg 974: REMOVE to the LinkedIntList
        System.out.println(" REMOVE 31 to LinkedIntList lil at 4th position");
        lil.remove(3); 
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");                   
        // SIZE of newly filled LinkedIntList
        System.out.println(" SIZE of LinkedIntList lil = " + lil.size());        
        System.out.println("\n");          

        // ADD_SORTED to the LinkedIntList
        System.out.println(" ADD_SORTED 35, 5, 55, 25, 45 to LinkedIntList lil at 4th position");
        lil.addSorted(35); 
        lil.addSorted(5); 
        lil.addSorted(55); 
        lil.addSorted(25); 
        lil.addSorted(45);         
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");                   
        // SIZE of newly filled LinkedIntList
        System.out.println(" SIZE of LinkedIntList lil = " + lil.size());        
        System.out.println("\n");          

        // ==============================================================================
        //                                  EXERCISES
        // ==============================================================================
        System.out.println("EXERCISES: \n");

        System.out.println("Exercise #16.1 set(): ");
        lil.set(4,32);
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");         

        System.out.println("Exercise #16.2 min(): ");
        System.out.println(" lil.min() = " + lil.min()); 
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n"); 

        System.out.println("Exercise #16.3 isSorted(): ");
        System.out.println(" lil.isSorted() = " + lil.isSorted()); 
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");     

        System.out.println("Exercise #16.4 lastIndexOf(): ");
        int newValues1[] = {1, 18, 2, 7, 18, 39, 18, 40};
        lil.setNewValues(newValues1);
        System.out.println(" lil.lastIndexOf(18) = " + lil.lastIndexOf(18)); 
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");      

        System.out.println("Exercise #16.5 countDuplicates(): ");
        int newValues2[] = {1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40};
        lil.setNewValues(newValues2);
        System.out.println(" lil.countDuplicates() = " + lil.countDuplicates()); 
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");

        System.out.println("Exercise #16.6 hasTwoConsecutive(): ");
        int newValues3[] = {1,18,2,7,8,39,18,40};
        lil.setNewValues(newValues3);
        System.out.println(" lil.hasTwoConsecutive() = " + lil.hasTwoConsecutive());
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");

        System.out.println("Exercise #16.7 deleteBack(): ");
        System.out.println(" lil.deleteBack() = " + lil.deleteBack());
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");

        System.out.println("Exercise #16.8 switchPairs(): ");
        int newValues4[] = {10,25,31,47,52,68,77};
        lil.setNewValues(newValues4);
        lil.switchPairs();
        //System.out.println(" lil.switchPairs() = " + lil.switchPairs());
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");

        System.out.println("Exercise #16.9 sutter(): ");
        int newValues5[] = {1,8,19,4,17};
        lil.setNewValues(newValues5);
        lil.sutter();
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");
         */
        System.out.println("Exercise #16.18 doubleList(): ");
        int newValues6[] = {1,3,2,7};
        lil.setNewValues(newValues6);
        lil.doubleList();
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");
    }  // main

}  //  LinkedIntList_CLIENT

