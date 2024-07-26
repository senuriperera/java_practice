package randomnumbergenerator;
import java.util.Scanner;

public class RandomNumberGenerator {
    
    public static void numberGuessingGame(){
        Scanner sc = new Scanner(System.in);
        
        int num = 1+ (int)(Math.random()*100);
        int maxAttempts = 5;
        boolean guessedCorrectly = false;
        
        System.out.println("Guess a number between 1-100");
        for(int i=0;i<maxAttempts;i++){
            
            int guessNum = sc.nextInt();
            if (guessNum == num){
                System.out.println("Congratulations!You guessed correct");
            }
            else if(num>guessNum && i != maxAttempts - 1){
                System.out.println("Your guess is too low");
            }
            else if(num<guessNum && i != maxAttempts - 1){
                System.out.println("Your guess is too high");
            }
            System.out.println("Attempts remaining: " + ((maxAttempts-1)-i));
        }
        if (!guessedCorrectly) {
            System.out.println("Sorry, you've run out of attempts. The number was: " + num);
        }
    }
     public static void main(String[] args) {
          numberGuessingGame();
    }
}
    

