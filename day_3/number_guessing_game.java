import java.util.Random;
import java.util.Scanner;
public class number_guessing_game{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        
        int attempts=0,min=1,max=100, randomNumber=r.nextInt(min,max+1);
        int guess=0;

        while(guess!=randomNumber){
            guess=0;
            while(guess<1 || guess>100){
                System.out.print("Enter the number between 1-100");
                guess=sc.nextInt();
            }
            attempts+=1;
            

            if(guess>randomNumber){
                System.out.println("TOO HIGH, TRY AGAIN!");
                
            }
            else if(guess<randomNumber){
                System.out.println("TOO LOW, TRY AGAIN!");
            }
            else if(guess==randomNumber){
                System.out.println("You have successfully guessed the number");
                break;
            }
        }
        System.out.println("You have guessed the number in "+attempts+" no of attempts");

    
    }
}