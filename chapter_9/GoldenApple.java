public class GoldenApple extends Apple {
    private int total;
    
    public GoldenApple(int vitamin, int calories, String name, int total) {
        super(vitamin, calories, name);
        this.total = total;
    }

    public int getTotal() {
        return this.total;
    }
}