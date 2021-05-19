public class Circle implements Shape {
    public double radius;
    
    public Circle() {
        this(0.0);
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    
    public double getPerimeter() {
        return Math.PI * this.radius * 2;
    }
}