import java.text.NumberFormat;
import java.util.Locale;

public class GroceryItemOrder
{
// >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<
    public String name;
    public int quantity;
    public double pricePerUnit;

    // -------------- Constructors ---------------
    public GroceryItemOrder()
    {
// >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<
        this("", 0, 0.0);
    }
    public GroceryItemOrder(String name,int quantity,double pricePerUnit)
    {
// >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }    
    
    // ----------------- Helper Methods -------------
    public double getCost()
    {
 // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<
        return (double) pricePerUnit * quantity;
    }
    public void setQuantity(int q)
    {
// >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<
        this.quantity = q;
    }
    
    // ----------------- toString ----------------
    public String toString()
    {
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);                      
    
       return "Item Name: " + name +
              "\t Quantity: " + quantity +
              "\t Price Per Unit: $" + pricePerUnit +
              "\t Cost: " + moneyFormat.format(getCost());
    }
   
}
