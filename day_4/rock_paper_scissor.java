import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        String play_again="";
        int user_choice=0,computer_choice;
        boolean stop=false;
        System.out.println("********************");
        System.out.println("Welcome To Our Game!");
        System.out.println("********************");
        while(!stop){
            user_choice=0;
            play_again="";
            while(user_choice<1 || user_choice>3){
                System.out.println("1.Rock");
                System.out.println("2.Paper");
                System.out.println("3.Scissor");
                System.out.print("Enter Your Choice: ");
                user_choice=sc.nextInt();
            }
            System.out.println();
            computer_choice=r.nextInt(1,4);

            if ((user_choice==1 && computer_choice==3) || 
                (user_choice==2 && computer_choice==1) ||
                (user_choice==3 && computer_choice==2) ) {
                System.out.println("****");
                System.out.println("WIN!");
                System.out.println("****");
            }
            else if(user_choice==computer_choice){
                System.out.println("*****");
                System.out.println("DRAW!");
                System.out.println("*****");
            }
            else{
                System.out.println("*****");
                System.out.println("LOSE!");
                System.out.println("*****");
            }
            while(play_again.length()==0 && (!play_again.equalsIgnoreCase("Y") || !play_again.equalsIgnoreCase("N"))){
                System.out.print("Want To Play Again?");
                play_again=sc.next();
            }
            if(play_again.equalsIgnoreCase("N")){
                stop=true;
            }

        }
        System.out.println("*******************************");
        System.out.println("Thank You For Playing The Game!");
        System.out.println("*******************************");
    }
}