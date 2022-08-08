/** 
     * My words and actions will reflect Academic Integrity.
     * I will not cheat or lie or steal in academic matters.
     * I will promote integrity in the UNCG community.
     * Madelyn Good     2/1/2022
     */
    
    // Rectangle
    
    /*
       Madelyn Good
       CSC 230, Sec 3
    */

public class main {
    public static void main(String[] args) {
        System.out.println("Rectangle");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-03");
        
        // program information
        System.out.println("\nThis program creates and uses a class called Rectangle.");
        System.out.println("The Rectangle class has one constructor and 5 other methods.");
        System.out.println("The setLength() method will set the length to 2.5."); 
        System.out.println("The setWidth() method will set the width to 5.2.");
        System.out.println("The getLength() method will return the length.");
        System.out.println("The getWidth() method will return the width of the rectangle.");
        System.out.println("The getArea() method will return the length * width.");

        // create object of Rectangle
        Rectangle rectangle1 = new Rectangle();

        // specify lengths using setter 
        rectangle1.setLength(2.5);
        rectangle1.setWidth(5.2);

        // access everything using getter 
        System.out.println("\nThe rectangle's length is " + rectangle1.getLength());
        System.out.println("The rectangle's width is " + rectangle1.getWidth());
        System.out.println("The rectangle's area is " + rectangle1.getArea());
    }
}