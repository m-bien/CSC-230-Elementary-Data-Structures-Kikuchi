package GoodMHW2;

import java.util.Scanner;

/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     2/15/2022
 */

// Homework Two

/*
   Madelyn Good 
   CSC 230, Sec 3
 */

public class GoodMHW2 {

    // ----------- string method -----------   
    public static int countUppercase(String str) {
    
    /*  int count = 0;
       
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }    
        } 
        return count; 
    */
    
        if (str.length() == 0) { 
            return 0;
        } else {
            if (Character.isUpperCase(str.charAt(0))) 
                return countUppercase(str.substring(1)) + 1;
        }            
        return countUppercase(str.substring(1));   
    } 

    
    // ----------- array method -----------
    public static int count(char[] chars) {    

        return count(chars, chars.length);
        
    }
    
    // ----------- helper method -----------
    public static int count(char[] chars, int high) {        
     
    /*  high = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                high++;
            }
        }
        return high;
     */
    
        if (high == 0) { 
            return 0;                    
        } else {
            if (Character.isUpperCase(chars[high - 1])) 
                return count(chars, high - 1) + 1;
        }            
        return count(chars, high - 1);
    } 
        

    // ----------- main method -----------
    public static void main (String[] args) {
        System.out.println("GoodMHW2");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-03");
        
        System.out.println("\nThis program creates a recursive method called countUppercase() to return");
        System.out.println("  the number of uppercase letters in a string");
        System.out.println("A second method uses a recursive method and a helper method.");
        System.out.println("The method is called count() and it returns the number of uppercase letters in an array of");
        System.out.println("  characters.");
        
        Scanner scanner = new Scanner(System.in);
        
        // prompt user string method
        System.out.println("\nThis is the run from calling countUppercase()");
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // call string method
        System.out.println("The uppercase letters in " + str + " is " + countUppercase(str));  
        
        // prompt user array method
        System.out.println("\nThis is the run from calling count()");
        System.out.print("Enter a string: ");
        String ch = scanner.nextLine();
        
        // call array method
        System.out.println("The number of uppercase letters is " + count(ch.toCharArray())); 
    }
}