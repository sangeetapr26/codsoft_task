import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();
        int max=7, totalRounds=3,roundsWon=0;
        for(int round=1;round<=totalRounds;round++){
            System.out.println("\nRound"+round);
            int numberToGuess= random.nextInt(100)+1;
            int attempts=0;
            while(attempts<max){
                System.out.print("Guess number between 1 to 100: ");
                try{
                    int guess= sc.nextInt();
                    attempts++;
                    if(guess<numberToGuess){
                        System.out.println("Too low");
                    }
                    else if(guess>numberToGuess){
                        System.out.println("Too high");
                    }
                    else{
                        System.out.println("You guessed the number in "+attempts+" attempts.");
                        roundsWon++;
                        break;
                    }
                    }
                    catch(java.util.InputMismatchException e){
                        System.out.println("Invalid input.Please enter number");
                }
            }
             if(attempts==max){
                System.out.println("You ran out of attempts.\nThe number was: "+numberToGuess);
                }
        }
        System.out.println("\nGame over");
        System.out.println("Rounds Won: "+roundsWon+" out of "+totalRounds);
        sc.close();

    }
}
        