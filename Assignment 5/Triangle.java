package GoodMHW5;


public class Triangle extends GeometricObject {
    
    // private fields
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    // construct default triangle
    protected Triangle() {
    }
    
    // construct triangle that sets the sides
    protected Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    // calculate area
    public double getArea() {
        double a = this.side1;
        double b = this.side2;
        double c = this.side3;
        double s = (a + b + c) / 2; 
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    
    // calculate perimeter
    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }
    
    // print results
    @Override
    public String toString() { 
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
        
    }
    
}