public abstract class Apple implements Fruit
{
    private int vitamin;
    private int calories;
    private String name;

    
    public Apple(int vitamin, int calories, String name){
        this.vitamin = vitamin;
        this.calories = calories;
        this.name = name;
    }
    
    public int getVitamin() {
        return this.vitamin;
    }
    
    public int getCalories() {
        return this.calories;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setVitamin(int newVitamin) {
        this.vitamin = vitamin;
    }
    public void setCalories(int newCalories){
        this.calories = calories;
    }
    public void setName(String newName) {
        this.name = name;
    }
    
    public abstract int getTotal();
    
    public String toString() {
        return "Fruit's name: " + this.getName() + "\nFruit's vitamin: " + this.getVitamin() 
                + "\nFruit's calories: " + this.getCalories();
    }
    
}
