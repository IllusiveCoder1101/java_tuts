import java.util.Scanner;
public class quiz_game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions={"Who wrote the play Romeo and Juliet?","What is the chemical symbol for water?","Which is the largest mammal in the world?","Which gas do plants absorb from the atmosphere?"};
        String[][] options= {{"Charles Dickens"," William Shakespeare","Mark Twain","Jane Austen"},
                             {"O2","H2O","CO2","HO2"},
                             {"African Elephant","Blue Whale","Giraffe","Polar Bear"},
                             {"Oxygen","Hydrogen","Nitrogen","Carbon Dioxide"}};
        int[] correct_option={2,2,2,4};
        int score=0,guess_option=0;
        System.out.println("*************************");
        System.out.println("Welcome To The QUIZ GAME!");
        System.out.println("*************************");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            guess_option=0;
            for(int j =0;j<options[i].length;j++){
                System.out.printf("%d. %s. \n",(j+1),options[i][j]);
            }
            while(guess_option<1 || guess_option>options[i].length){
                System.err.print("Enter your guess: ");
                guess_option=sc.nextInt();
            }
            System.out.println();
            if(guess_option==correct_option[i]){
                System.out.println("***********************");
                System.out.println("You've guessed CORRECT!");
                System.out.println("***********************");
                score+=1;
            }
            else{
                System.out.println("*********************");
                System.out.println("You've guessed WRONG!");
                System.out.println("**********************");
            }
        }
        System.out.println("*************************");
        System.out.printf("Your Final Score is: %d(%d) \n",score,questions.length);
        System.out.println("*************************");
    }
}