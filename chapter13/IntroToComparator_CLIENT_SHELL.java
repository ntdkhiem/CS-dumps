
/**
 * Pg 825 Chapter 13 - Intro to Comparator
 *  Show the difference between Comparable and Comparator in an array of some words
 *  from the NATO phonetic alphabet codeWord list. (https://en.wikipedia.org/wiki/NATO_phonetic_alphabet)  
 */

/* pg 826 Comparator Interface:
 * public interface Comparator<T> {
 *     public int compare(T obj1,T obj2)
 * }
 * 
 * Comparator Template:
 * public comparatorObjectName implements Comparator<Type> {
 *     public int compare(Type obj1, Type obj2)
 *     {
 *          return obj1.SomeThing - obj2.SomeThing;    
 *     }
 * }
 * 
 * 
 */


/*  OUPUT:
 * codeWords[0] "Foxtrot" compareTo codeWords[i] via regular String Comparable  : 
    Foxtrot.compareTo(Foxtrot) = 0
    Foxtrot.compareTo(alpha) = -27
    Foxtrot.compareTo(echo) = -31
    Foxtrot.compareTo(golf) = -33
    Foxtrot.compareTo(bravo) = -28
    Foxtrot.compareTo(hotel) = -34
    Foxtrot.compareTo(Charlie) = 3
    Foxtrot.compareTo(DELTA) = 2

 Pg 825 codeWords: [Foxtrot, alpha, echo, golf, bravo, hotel, Charlie, DELTA]

 Pg 826 Arrays.sort(codeWords): [Charlie, DELTA, Foxtrot, alpha, bravo, echo, golf, hotel]

 Pg 827 Arrays.sort(codeWords, String.CASE_INSENSITIVE_ORDER): [alpha, bravo, Charlie, DELTA, echo, Foxtrot, golf, hotel]

 Pg 827 Arrays.sort(codeWords, new LengthComparator()): [echo, golf, alpha, bravo, DELTA, hotel, Charlie, Foxtrot]

 MadeUp: Arrays.sort(codeWords, new LastCharacterOrderComparator()): [DELTA, alpha, Charlie, golf, hotel, echo, bravo, Foxtrot]
 * 
 * 
 */

import java.util.*;

public class IntroToComparator_CLIENT_SHELL
{
   public static void main()
   {
   // sort Strings using case-insensitive Comparator
   String codeWords[] = {"Foxtrot", "alpha", "echo", "golf",
                        "bravo", "hotel", "Charlie", "DELTA"};
       
            // codeWords[0] "Foxtrot" compareTo codeWords[i] via regular String Comparable            
            System.out.println("codeWords[0] \"Foxtrot\" compareTo codeWords[i] via regular String Comparable  : "); 
            for (int i=0; i<codeWords.length; i++) 
                System.out.println("\t"+codeWords[0]+".compareTo("+codeWords[i]+") = " + codeWords[0].compareTo(codeWords[i]));    
            System.out.println();                        
                        
            // Pg 825 codeWords             
            System.out.print(" Pg 825 codeWords: "); 
            System.out.print("[");
            for (int i=0; i<codeWords.length-1; i++) 
                System.out.print(codeWords[i] + ", ");
            System.out.println(codeWords[codeWords.length-1]+"]");    
            System.out.println();
            
            // Pg 826: Arrays.sort(codeWords)             
            System.out.print(" Pg 826 Arrays.sort(codeWords): "); 
            Arrays.sort(codeWords);
            System.out.print("[");
            for (int i=0; i<codeWords.length-1; i++) 
                System.out.print(codeWords[i] + ", ");
            System.out.println(codeWords[codeWords.length-1]+"]");  
            System.out.println();            
            
            // Pg 827: Arrays.sort(codeWords, String.CASE_INSENSITIVE_ORDER);
            System.out.print(" Pg 826 Arrays.sort(codeWords, String.CASE_INSENSITIVE_ORDER): "); 
            Arrays.sort(codeWords,String.CASE_INSENSITIVE_ORDER);
            System.out.print("[");
            for (int i=0; i<codeWords.length-1; i++) 
                System.out.print(codeWords[i] + ", ");
            System.out.println(codeWords[codeWords.length-1]+"]");   
            System.out.println();              
            
            // Pg 827: Arrays.sort(codeWords, new LengthComparator())            
            System.out.print(" Pg 826 Arrays.sort(codeWords, new LengthComparator()): "); 
            Arrays.sort(codeWords, new LengthComparator());     
            System.out.print("[");
            for (int i=0; i<codeWords.length-1; i++) 
                System.out.print(codeWords[i] + ", ");
            System.out.println(codeWords[codeWords.length-1]+"]");     
            System.out.println();           
            
            // Use LastCharacterOrderComparator: Arrays.sort(codeWords, new LastCharacterOrderComparator())            
            System.out.print(" Pg 826 Arrays.sort(codeWords, new LastCharacterOrderComparator()): "); 
            Arrays.sort(codeWords, new LastCharacterOrderComparator()); 
            System.out.print("[");
            for (int i=0; i<codeWords.length-1; i++) 
                System.out.print(codeWords[i] + ", ");
            System.out.println(codeWords[codeWords.length-1]+"]");     
            System.out.println();             
    } // main
} // IntroToComparator

