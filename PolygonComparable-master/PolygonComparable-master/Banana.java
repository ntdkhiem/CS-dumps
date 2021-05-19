public abstract class Banana implements Fruit{
    private String type;
    private double calories;
    private String category;
    
    public Banana(){
        this("Banana", 105);
    }
    
    public Banana(String type, double calories){
        this.type = type;
        this.category = "Banana";
        this.calories = calories;
    }

    public String getType() {
        return this.type;
    }
    
    public String getCategory() {
        return this.category;
    }
    
    public double getCalories() {
        return this.calories;
    }
    
    public void setType(String newType) {
        this.type = newType;
    }
    
    public void setCalories(double newCalories) {
        this.calories = calories;
    }
    
    public String toString() 
    { 
        return "Type = " + this.type + "\tCategory = " + this.category + "\tCalories = " + this.calories;
    }
}