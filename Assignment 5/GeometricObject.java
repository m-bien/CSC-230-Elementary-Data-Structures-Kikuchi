package GoodMHW5;

public abstract class GeometricObject {
    
    // ** Copied from Listing 13.1 from book **
    
    // private fields
    private String color = "";
    private boolean filled;
    
    
    // construct default geometric object
    protected GeometricObject() {
    }

    // construct geometric object with color and filled value
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // return color
    public String getColor() {
        return color;
    }

    // set color
    public void setColor(String color) {
        this.color = color;
    }

    // return filled
    public boolean isFilled() {
        return filled;
    }
    
    // set filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "color: " + color
                + " and filled: " + filled;
    }

    // abstract method getArea
    public abstract double getArea();

    // abstract method getPerimeter
    public abstract double getPerimeter();
}
