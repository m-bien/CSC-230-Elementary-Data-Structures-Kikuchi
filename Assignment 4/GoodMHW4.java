package GoodMHW4;

import java.util.*;
import java.io.*;
/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Madelyn Good     3/22/22
 */

// Homework Four

/*
   Madelyn Good
   CSC 230-03
*/

public class GoodMHW4 {
    
    // ----- ascending order -----
    public static void sortArraysMethod(int[] array) {
        
        Arrays.sort(array);
    }                        
    
    
    // ----- print sorted array -----
    public static void printValuesMethod(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    
    // ----- average -----
    public static double averageArrayMethod(int[] array) {
        
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        double average = total / array.length;
        
	return average;
    }
    
    
    // ----- standard deviation -----
    public static double StandDev(int[] array) {
        
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double mean = sum / array.length;
        
        double deviation = 0.0;
        for (int i = 0; i < array.length; i++) {
            deviation = deviation + Math.pow((array[i] - mean), 2);
        }
        double standDev = Math.sqrt(deviation / array.length);
        
	return standDev;
    }    
    
    
    // ----- print results to file -----
    public static void printToFileArray(int[] array, double standardDev, double gradeAverage, PrintWriter output) {
        
        output.println("The array in ascending order is: ");
        for (int i = 0; i < array.length; i++){
            output.print(array[i] + " ");
        }
        output.println();
        
        output.format("\nThe Standard Deviation of the Grades is %.3f\n", standardDev);
        output.format("The Average of the Grades is %.3f\n", gradeAverage);
        
        output.close();
    }
    
   
    // ***** main method *****
    public static void main (String[] args) throws IOException {
        
        // ----- create file -----   
	File inputFile = new File("gradesIn.txt");
        Scanner input = new Scanner(inputFile);
        
	File outputFile = new File("gradesOut.txt");
    	PrintWriter output = new PrintWriter(outputFile);
        
        
        // ----- program info -----
        System.out.println("GoodMHW4");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-03");
        
        System.out.println("\nThis program loads to an array a list of 50 grades read from a file.");
        System.out.println("Once the scores have been loaded to the array, provide the user with a menu of options:");
        System.out.println("  A. Print the grades to the screen sorted in ascending order");
        System.out.println("  B. Calculate and return the average value of the scores");
        System.out.println("  C. Calculate and return the standard deviation of the scores");
        System.out.println("  D. Print the grades to a file sorted in ascending order, along with the average value");
        System.out.println("     and standard deviation of the scores");
        System.out.println("  E. Quit");
        
        
        // ----- variables -----
        int[] array = new int[50];
        double gradeAverage = 0.0;
	double standardDev = 0.0;
	char choice;
        char convertChoice;
	int i = 0;
        
        
        // ----- menu and switch -----
        Scanner menu = new Scanner(System.in);
        
        // read file input
        while(input.hasNextInt()) {
            array[i++] = input.nextInt();
        }
        
        do { 
           System.out.println("\n**************************************************************************");
           System.out.println("* Menu: \t\t\t\t\t\t\t\t *");
           System.out.println("* A - Show Grades in Ascending Order \t\t\t\t\t *");
           System.out.println("* B - Calculate the average value of the scores \t\t\t *");
           System.out.println("* C - Calculate the Standard Deviation of the scores \t\t\t *");
           System.out.println("* D - Create File with Grades, Average, and Standard Deviation \t\t *");
           System.out.println("* E - Quit \t\t\t\t\t\t\t\t *");
           System.out.println("**************************************************************************");
        
           System.out.print("Enter a letter for your choice on the menu (A, B, C, D, or E): ");
           choice = menu.next().charAt(0);
           convertChoice = Character.toUpperCase(choice);
                   
           switch (convertChoice) {
               case 'A':
                   sortArraysMethod(array);
                   System.out.print("The array in ascending order is: ");
                   printValuesMethod(array);
                   System.out.println();
                   break;
               case 'B':
                   gradeAverage = averageArrayMethod(array);
                   System.out.printf("The Average of the Grades is %.3f", gradeAverage);
                   System.out.println();
                   break;
               case 'C':
                   standardDev = StandDev(array);
                   System.out.printf("The Standard Deviation of the Grades is %.3f", standardDev);
                   System.out.println();
                   break;
               case 'D':                 
                   printToFileArray(array, gradeAverage, standardDev, output);
                   System.out.print("A file has been created");
                   System.out.println();
                   break;
               case 'E':
                   System.out.print("Thanks for using my program!\n");
                   break;   
               default:
                   System.out.print("Invalid letter\n");
                   break;
           }
           
        } while (convertChoice != 'E');     
    }
}