

/**
 * LL_Basic_Outline_CLIENT_RIGHT:
 *    This program introduces the concept of 'Node' and a 'Linked List (LL)'.
 *    This also shows when programming  the 'head' as a global var is RIGHT!!!  
 * 
*/

import javax.swing.JOptionPane;

public class LL_Basic_Outline_CLIENT_RIGHT
{
    private static Node head=null;  // RIGHT!!! :)

    // ==================================================================================
    public static void main()
    {
        int choice=0;
    
        do {
            
            choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a option: \n" + 
                             " 1 = Enter a number. \n" + 
                             " 2 = Show the list. \n" + 
                             " 3 = Quit"));                             
            switch (choice) {
                case 1 : 
                       inputNum();  // RIGHT!!! :)
                       break;
                case 2 :
                        printList();     // RIGHT!!! :)
                        break;
                case 3: 
                        printList();   // RIGHT!!! :)
                        quit();
                        break;
            } // switch        
      
        } while (1 == 1);
 
    } // init
    
    // ==================================================================================    
   public static void inputNum()   // RIGHT!!! :)
   {
        Node n;
        Node current;
        int k;

        k = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:"));
        n = new Node(k);       
  
        // RIGHT!!! :)
        // Attach it to the list, either being the 'head' or somewhere along the line.
         if (head == null) {
            head = n;            
         } else {            
            // find the end of the list to attatch the new node
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
                
            // we are at the end of the list so attach the node.    
            current.setNext(n);                
        }       

       
    } // inputNum
    
    
    // ==================================================================================   
    public static void printList()   //  RIGHT!!! :)
    {
        Node current=head;  // RIGHT!!! :)
        StringBuilder op = new StringBuilder();
    
        //Method 1 .. too much!!
        if (current == null)
           op.append(" The list is empty!!");    
        else {
            op.append(current.getData()).append(", ");
            while (current.getNext() != null) {
                current = current.getNext();
                op.append(current.getData()).append(", ");    
            }
        }        
        JOptionPane.showMessageDialog(null,"while loop output:  " + op + "\n\n");          
            
        //Method 2  >>>>>> Preferred way!! <<<<<<
        op = new StringBuilder();    
       // for (current=h; current != null; current = current.getNext())  // WRONG!!     
        for (current=head; current != null; current = current.getNext())  // RIGHT!!
                op.append(current.getData()).append(", ");                
        JOptionPane.showMessageDialog(null,"for loop output:  " + op + "\n\n");             
           
    } // printList
    
    // ==================================================================================   
    public static void quit()
    {
           JOptionPane.showMessageDialog(null,"Thanks for playing!! BYE!!");     
           System.exit(0);           
    }
        
    
} // LL_Basic_Outline_CLIENT


