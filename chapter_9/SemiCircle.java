public class SemiCircle extends Circle {
    public SemiCircle() {
        this(0.0);
    }
    
    public SemiCircle(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return (Math.PI * this.radius * this.radius) * 0.5; 
    }
    
    public double getPerimeter() {
        return (Math.PI * this.radius * 2.0) * 0.5;
    }
}