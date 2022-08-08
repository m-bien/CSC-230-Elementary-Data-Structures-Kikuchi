package GroupHW6;

import java.io.*;
import java.util.*;

public class GroupHW6 {
    
    // ----- generate lottery number -----
    public static int generateNumber() {
        int num = 100 + (int) (Math.random() * 900);
        
        return num;
    }
    
    
    // ----- get user guess -----
    public static int getGuess() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your lottery pick (three digits, zeros are fine as are duplicates): ");
        int guess = input.nextInt();
        
        return guess;
    }
    
    
    // ----- compare numbers -----
    public static void checkNumbers(int guess, int lotteryNum, int num1, int num2, int num3,
                                     int guess1, int guess2, int guess3,
                                     ArrayList<Integer> guessNumbers, ArrayList<Integer> lotteryNumbers) 
                                     throws java.io.IOException {
        
        if (lotteryNum == guess) {
            System.out.println("Exact match: You win $10,000!");
            collectWinners();
        } else if (lotteryNumbers.equals(guessNumbers)) {
            System.out.println("You matched all of the numbers: You win $3,000!");
        } else if (lotteryNumbers.containsAll(guessNumbers.subList(0, 2))) {
            System.out.println("You matched two of the numbers: You win $2,000!");
        } else if (lotteryNumbers.containsAll(guessNumbers.subList(0, 1))) {
            System.out.println("You matched one of the numbers: You win $1,000!");
        } else {
            System.out.println("Sorry, you did not match the numbers: Try again.");
        }
    }
    
          
    // ----- winner -----
    public static void collectWinners() throws IOException {
        try {
            Scanner input = new Scanner(System.in);
            
            System.out.print("\nPlease enter your first name and last name, separated by a space: ");
            String name = input.nextLine();
            
            PrintWriter output = new PrintWriter(new FileOutputStream("Winners.txt", true));
            
            output.print(name);
            output.println();
            output.close();
            
        } catch (IOException ex) {
            System.out.println("\nSomething went wrong\n" + ex);
        }
    }
    

    // ***** main method *****
    public static void main(String[] args) throws IOException {
        System.out.println("Darian Morales*");
        System.out.println("Madelyn Good");
        System.out.println("Philip Sijerkovic");
        System.out.println("Homework 6");
        System.out.println();
        System.out.println("This program will play a lottery with the user.");
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        
        char playAgain = 'y';
        
        do {
            
            int guess = getGuess();
           
            int lotteryNum = generateNumber();
            System.out.println("The lottery number is " + lotteryNum);
            
            // extract digits (user guess)
            int guess1 = guess / 100 % 10;
            int guess2 = guess / 10 % 10;
            int guess3 = guess % 10;
            
            // extract digits (lottery number)
            int num1 = lotteryNum / 100;
            int num2 = lotteryNum / 10 % 10;
            int num3 = lotteryNum % 10;
            
            // create list (user guess)
            ArrayList<Integer> guessNumbers = new ArrayList<>();
            guessNumbers.add(guess1);
            guessNumbers.add(guess2);
            guessNumbers.add(guess3);
            Collections.sort(guessNumbers);
            
            // create list (lottery number)
            ArrayList<Integer> lotteryNumbers = new ArrayList<>();
            lotteryNumbers.add(num1);
            lotteryNumbers.add(num2);
            lotteryNumbers.add(num3);
            Collections.sort(lotteryNumbers);

  
            // ----- compare numbers -----
            checkNumbers(guess, lotteryNum, num1, num2, num3, guess1, guess2, guess3, guessNumbers, lotteryNumbers);
            
            // collectWinners();
            
            
            // ----- play again -----
            System.out.print("\nWould you like to play again? ");
            
            playAgain = input.next().charAt(0);
            playAgain = Character.toLowerCase(playAgain);
            
        } while (!(playAgain == 'n'));
    }

}
