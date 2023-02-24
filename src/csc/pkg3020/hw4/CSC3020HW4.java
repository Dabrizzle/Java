package csc.pkg3020.hw4;
import java.util.Scanner;
/** Caught class will have two random ints that will be for where your 
 * partner is and where an informant is which will get you caught if you
 * find them. 
 * @author D
 */
class Caught {
    double rando = Math.random();
    int holding = (int) (41*rando);
    int[] guesses = new int[8]; 
    int informant = (int) (41*rando);
    int NewGuess() {
    Scanner sc = new Scanner(System.in);
    int guess = sc.nextInt();
    return guess; }
//make an overloaded found function, where one is for found the partner
// and the next one is if you are found by an informant. 
    boolean found (int guess) {
        if (guess == holding) {
            System.out.println("You found them in cell: " + holding);
            return true;
    }
        else {
            return false;
        }
}}
/**Has an override function that when called if it matches the informant
 * than it will tell the user they have been caught, otherwise it will continue.
 * @author D
 */
class Escape extends Caught {
    @Override
    boolean found (int guess) {
        if (guess == informant) {
            System.out.println("Oh no, you were caught by a informant in cell: "
            + informant);
            return true;
        }
        else {
            return false;
        }
    }
}
public class CSC3020HW4 {
    public static void main(String[] args) {
        System.out.println("Would you like to attempt to break your buddy out?"
                + "(y/n): ");
        Scanner sca = new Scanner(System.in);
        while (!sca.next().equalsIgnoreCase("n")) {
            System.out.println("Ok then, be careful as there are 'snitches' in "
                    + "some of the cells...even in your partners.");
            
            System.out.println("Please give me 8 guesses of what cell you thin"
                    + "k they are in: (HINT: THERE ARE 40 CELLS)");
            Escape trying = new Escape();
            System.out.println(trying.holding); //to test if they find partner
            System.out.println(trying.informant); //to test if they are caught
            //adds each guess to the array in our Caught class
            for (int i = 0; i < 8; i++) {
                trying.guesses[i] = trying.NewGuess();}
            for (int i = 0; i < 8; i++) {
                if (trying.found(trying.guesses[i])) {
                    break; }
                else {
                    if (i < 8) {}
                    if (i == 7) {
                        System.out.println("Please try again. They staying trap"
                                + "ped."); }
                }
            }
            
            System.out.println("Would you like to attempt to break your buddy o"
                    + "ut? (y/n): ");
            sca.nextLine();
        }          
    }
}