
import java.util.Scanner;

public class array_input{
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int n;
        String[] foods;
        System.out.print("Enter the no of foods: ");
        n=scanner.nextInt();
        scanner.nextLine();
        foods=new String[n];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of food");
            foods[i]=scanner.nextLine();
        }  
        for(String food: foods){
            System.out.println(food);
        }
    }
}