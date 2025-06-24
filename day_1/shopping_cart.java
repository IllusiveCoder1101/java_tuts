
import java.util.Scanner;

public class shopping_cart{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String itemName="";
        double price=0;
        int quantity=0;

        System.out.print("What would you like to buy?: ");
        itemName=sc.nextLine();
        System.out.print("What is the price for each? ");
        price=sc.nextDouble();
        System.out.print("How many would you like? ");
        quantity=sc.nextInt();

        System.out.println("You have bought "+quantity+" "+itemName+"/s");
        System.out.println("Your Total is: $"+(price*quantity));
    }
}