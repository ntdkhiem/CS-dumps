public class Food
{
    private String name;
    private String type;
    private boolean isConsumable;
    private double totalProtein;
    
    
    public Food() {
        this("apple", "fruit", true, 35.5);
    }
    public Food(String name, String type, boolean isConsumable, double totalProtein) {
        this.name = name; this.type = type; this.isConsumable = isConsumable; this.totalProtein = totalProtein;
    }
    public String getName() {return this.name;}
    public String getType() {return this.type;}
    public boolean checkConsumable() {return this.isConsumable;}
    public double getProtein() {return this.totalProtein;}
    public void setConsumable(boolean bool) {this.isConsumable = bool;}
    public String toString() {
        return("Item name: " + this.name + "\tType: " + this.type + "\tConsumable: " + this.isConsumable + "\tTotal Protein: " + this.totalProtein);
    }
}
