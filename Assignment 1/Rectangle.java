class Rectangle { 
    
    // private fields
    private double length;
    private double width;
    
    // construct rectangle  
    Rectangle() {
        
    }
    // get length of rectangle 
    public double getLength() {
        return length;
    }
    // get width of rectangle
    public double getWidth() {
        return width;
    }
    // get area of rectangle
    public double getArea() {
        return length * width;
    }
    // set length of rectangle
    public void setLength(double length) {
        this.length = length;
    }
    // set width of rectangle
    public void setWidth(double width) {
        this.width = width;
    }
    
} 