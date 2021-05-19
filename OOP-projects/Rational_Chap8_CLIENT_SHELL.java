import javax.swing.*;
import java.util.*;

public class Rational_Chap8_CLIENT_SHELL
{

   // CLIENT
   public static void main()
   {
        Rational r1 = new Rational(1,2), r2 = new Rational(3,4);
        Rational r3,r4,r5,r6;
        ArrayList<Rational> rationals = new ArrayList<Rational>();    

        // perform calculations
        r3 = r1.add( r2 );
        System.out.println( r1.toString() + " + " + r2.toString() + " = " + r3.toString() + 
            " OR as a decimal: " + r3.toFloatString() + "\n");

        r4 = r1.subtract( r2 );
        System.out.println( r1 + " - " + r2.toString() + " = " + r4 + 
            " OR as a decimal: " + r4.toFloatString() + "\n");

        r5 = r1.multiply( r2 );
        System.out.println( r1.toString() + " * " + r2 + " = " + r5 + 
            " OR as a decimal: " + r5.toFloatString() + "\n");

        r6 = r1.divide( r2 );
        System.out.println( r1 + " / " + r2 + " = " + r6 + " \n "
            + " OR as a decimal: " + r6.toFloatString() + "\n");
            
        // Put all the Rationals into the ArrayList rationals
        rationals.add(r1); rationals.add(r2); rationals.add(r3); 
        rationals.add(r4); rationals.add(r5); rationals.add(r6);    
        
        //Print them out as follows
        System.out.println("ArrayList 'rationals': " + rationals);        
        for(Rational r : rationals) {
            System.out.println("r.toString() = " + r.toString() + "  r.toFloatString() = " + r.toFloatString());
        }
        System.out.println();
        
        // Find largest + smallest and output them.
        Rational largest = findLargest(rationals);
        Rational smallest = findSmallest(rationals);        
        System.out.println("largest rational = " + largest);
        System.out.println("smallest rational = " + smallest);  
        System.out.println();        
        
        // Find out if any of the rationals are equal to each other.
        System.out.println("Are any Rationals equalTo each other = " + anyRationalsEqual(rationals));
        System.out.println();        
                
   } // main

   public static Rational findLargest(ArrayList<Rational> rats)
   {
       //>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<
       Rational largest = rats.get(0);
       for (Rational num: rats) {
           if (num.greaterThan(largest)) {
               largest = num;
           }
       }
       return largest;
   }  // findLargest
   
   public static Rational findSmallest(ArrayList<Rational> rats)
   {
       //>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<
   }  // findLargest      
   public static boolean anyRationalsEqual(ArrayList<Rational> rats)
   {
       //>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<
   }     

}  // Rational_Chap8_CLIENT
