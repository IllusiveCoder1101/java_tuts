import java.util.Random;
import java.util.Scanner;
public class dice_roll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r =new Random();
        int no_of_rolls,maxNo=6,minNo=1,num_rolled,total_rolled=0;

        System.out.print("Enter how many times you want to roll: ");
        no_of_rolls=sc.nextInt();

        for(int i=1;i<=no_of_rolls;i++){
            num_rolled=r.nextInt(minNo, maxNo+1);
            
            System.out.println("You rolled: "+num_rolled);
            total_rolled+=num_rolled;
        }
        System.out.println("Total of all rolls: "+total_rolled);

    }
}