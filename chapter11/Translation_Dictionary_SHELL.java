import java.util.LinkedList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;

public class Translation_Dictionary_SHELL
{


    public static void main()
    {
      Map<String,Set> dictionary = new TreeMap<String,Set>();
      Map reverseMapDictionary;
      String wordsAndTranslationsArray[][] = {   // English to Spanish where the first element of each row
                                                {"holiday","fiesta", "vaccaciones"}, // is the 'key' and the 'value' is a set containing 
                                                {"celeberation", "celebracion", "fiesta"}, // the rest of the words associated with it.
                                                {"party", "fiesta", "partido", "velada"},
                                                {"feast","fiesta"},
                                                {"beautiful", "bello", "bonito", "hermoso"},
                                                {"nice", "ameno", "agradable", "bonito", "simpatico"},
                                                {"pretty", "bonito", "lindo"}
                                              };    
      // Put the words into the Map as key-English value-Spanish
      for (int i=0; i<wordsAndTranslationsArray.length; i++) 
          for (int j=1; j<wordsAndTranslationsArray[i].length; j++) 
              add(dictionary,wordsAndTranslationsArray[i][0],wordsAndTranslationsArray[i][j]); 

      // OutPut the English->Spanish dictionary.
      printDictionary(dictionary,"English","Spanish");     
          
      // create the reverseMapDictionary
      reverseMapDictionary = reverse(dictionary);
      
      // OutPut the Spanish->English dictionary.
      // printDictionary(reverseMapDictionary,"Spanish","English");     
                           
           
    } // main
    public static void add(Map dictionary, String word, String wordTranslation)
    {
      TreeSet<String> values;
      if (!dictionary.containsKey(word)) {
        values = new TreeSet<String>();
        dictionary.put(word, values);
      }
      values = (TreeSet)dictionary.get(word);
      values.add(wordTranslation);
      dictionary.put(word, values);
    } // add
    
    
    // =============================================================================    
    /* Write a method that takes a dictionary and generates a reverse dictioanry.  A reverse
     * dictionary uses the same structure as the original dictionary, and for each pair 
     * (word, translations) in the original dictionary there is a reversed pair (translation, word) 
     * in the reverse dictionary. For example, if you can find holiday->fiesta in an English->Spanish 
     * dictionary, you should be able to find fiesta->holiday in its reverse Spanish->English dictionary. 
     * Write reverse as started below.  You can assume that the add method from Part (a) is in the same 
     * class and works as specified.
     * 
     * precondition:  dictionary != null
     *                 dictionary associates a TreeSet of translations with each word.
     * postcondition: returns a reverse dictionary with a similar structure and the following property:
     *                word2 is in the set of translations associated with word1 if and only if word1 is 
     *                in the set of translations associated with word2 in the original dictionary.
     * 
     * */
    public static Map reverse(Map d)
    {
      Map<String, Set> reverseMapDictionary = new TreeMap<String, Set>();
      for (String i : (Set<String>)d.keySet()) { // loop though every key
        System.out.println(i);
        // for (String j : d.get(i)) { // loop through the set of values of the key
        //   add(reverseMapDictionary, j, i);
        // }
      }
      
      return null;
      // =======================  YOUR CODE HERE =======================  
        
    } // reverse
    
    // ========================================================================================
    // OutPut the dictionary.
    public static void printDictionary(Map d,String language1,String language2)
    {    
    Iterator<String> it1 = d.keySet().iterator();   // set it1 to iterate over the keyset gathered from d.
            
        System.out.println("\n -------------------------------------------------------------------- ");
        System.out.println(language1 + " -> " + language2 + ": ");
        while (it1.hasNext()) {
            String word =  it1.next();                     // get the key word
            System.out.print("\t" + word + ": ");          // output it
            Iterator it2 = ((Set)d.get(word)).iterator();  // set it2 to iterate over the value that matches
                                                           //   the key 'word', iow the Set of translations
            while (it2.hasNext())                          //   returned.
                System.out.print(it2.next() + ", ");            

            System.out.println();
         }  // while
        
    }  // printDictionary
                       
} // Translation_Dictionary_SHELL
