public class Triangle implements Shape {
    private double a,b,c;
    
    public Triangle(){
        this(0.0,0.0,0.0);
    }
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getArea() {
        double s = (this.a + this.b + this.c) / 2.0;
        return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    }
    
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }
}