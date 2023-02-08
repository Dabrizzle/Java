package csc.pkg3020.hw4;
import java.util.Scanner; 
/**class Prison_Break {
    int[] guesses = new int[8]; 
    double rando = Math.random();
    int holding = (int) (41*rando);    
}*/
public class CSC3020HW4 {
    public static void main(String[] args) {
        System.out.println("Would you like to attempt to break your buddy out?"
                + "(y/n): ");
        double rando = Math.random();
        int holding = (int) (41*rando); 
        Scanner sca = new Scanner(System.in);
        String choice = sca.nextLine();
        while (choice != "n") {
            System.out.println("Please give me 8 guesses of what cell you think "
                    + "they are in: ");
            int[] guesses = new int[8]; 
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 8; i++) {
                guesses[i] = sc.nextInt();
            }
            for (int i = 0; i < 8; i++) {
                if (guesses[i] == holding) {
                    System.out.println("YOU BOTH ESCAPED.");
                }
                else {
                    System.out.println("Please try again. They staying trapped.");
                }
            }
            System.out.println("Would you like to attempt to break your buddy out?"
                + "(y/n): ");
            choice = sca.nextLine();
        }          
    }
}