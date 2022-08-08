package GoodMHW5;

import java.util.*;
import java.io.*;

/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     3/29/22
 */

// Homework Five

/*
   Madelyn Good
   CSC 230-03
*/

public class main {
    
    public static void main(String[] args) throws IOException {
        System.out.println("GoodMHW5");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-03");
        
        // program info
        System.out.println("\nThis program consists of three classes, a main class, the Geometric object class, and a Triangle class.");
        System.out.println("The Triangle class extends from the Geometric object class.");
        System.out.println("The user will be asked to enter the 3 sides and the color of the triangle.");
        System.out.println("The user will also be asked to enter if the triangle is filled or not by entering a true if it is filled");
        System.out.println("  and a false if it is not filled");
        System.out.println("The results will be printed to the screen and to a file called triangleOut.out. When the program is");
        System.out.println("  run again, the new data will be appended to the old data in the file.");
        
        // declarations
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        String color = "";
        boolean filled = false;
        
        
        // ----- input window ------
        try {
            // user input
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter the 1st of three sides: ");
            side1 = input.nextInt();
            System.out.print("Enter the 2nd of three sides: ");
            side2 = input.nextInt();
            System.out.print("Enter the 3rd of three sides: ");
            side3 = input.nextInt();
            System.out.print("Enter the color: ");
            color = input.next();
            System.out.print("Enter a Boolean value for filled (true or false): ");
            filled = input.nextBoolean();

        } catch (Exception ex) {
            System.out.println("\nInvalid input\n" + ex);
        }
        

        // ----- output window -----       
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        
        System.out.println("\nThe color is " + triangle.getColor());
        
        if(triangle.isFilled()) {
            System.out.println("The triangle is filled");
        } else {
            System.out.println("The triangle is not filled");
        }
        
        System.out.printf("The area is %.3f " , triangle.getArea());
        System.out.printf("\nThe perimeter is %.3f " , triangle.getPerimeter());
        System.out.println();
        System.out.println(triangle.toString());
        
        
        // ----- output file -----
        try {
            // create file
            PrintWriter output = new PrintWriter(new FileOutputStream("triangleOut.out.txt", true));
           
            output.printf("The color is " + triangle.getColor());
            
            String isFilled = "";
            if (triangle.isFilled()) {
                isFilled = ("The triangle is filled");
            } else {
                isFilled = ("The triangle is not filled");
            }

            output.print("\n" + isFilled);
            output.printf("\nThe area is %.3f ", triangle.getArea());
            output.printf("\nThe perimeter is %.3f ", triangle.getPerimeter());
            output.println();
            output.println(triangle.toString());
            output.println();
            output.close();
            
        } catch (Exception ex) {
            System.out.println("\nSomething went wrong\n" + ex);
        }  
        
    }
    
}