import java.text.NumberFormat;
import java.util.Locale;

public class GroceryList
{
// >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<
    public int size;
    public GroceryItemOrder gList[];
  
    // -------------- Constructor ------------
    public GroceryList()
    {
        this.size=5;
        gList = new GroceryItemOrder[this.size];
        gList[0] = new GroceryItemOrder("Apples", 5, 0.49);
        gList[1] = new GroceryItemOrder("Bananas", 3, 0.35);
        gList[2] = new GroceryItemOrder("Catelope", 4, 1.23);
        gList[3] = new GroceryItemOrder("Dates", 10, 1.22);
        gList[4] = new GroceryItemOrder("Eggplant", 3, 2.55);
    }
    
    // ---------------- Helper Methods ---------
    public void add(GroceryItemOrder item)
    {
// >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<
        if (this.size > 9) {
            this.gList[this.size] = item;
            this.size++;
        }
        //if (this.gList.length < this.size) {
        //    this.gList[this.gList.length]
        //}
    }   
    public double getTotalCost()
    {
        double sum = 0.0;
        for (int i = 0; i < this.size; i++) {
            sum += (double) this.gList[i].getCost();
        }
        return sum;
    }
    
    // ------------------------ toString ----------------
    public String toString()
    {
// >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.gList[i]);
        }
        return "total = " + this.getTotalCost();
    }
}
