import java.util.Random;
import java.util.Scanner;
public class slot_machine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int balance,bet;
        String[] row;
        String[] emojis={"🤖","👽","👾"};
        boolean stop=false;
        String choice="";
        System.out.println("************************");
        System.out.println("Welcome To SLOT MACHINE!");
        System.out.println("************************");
        System.out.println("🤖");
        System.out.print("Enter your balance: ");
        balance=sc.nextInt();

        while(balance>0 && !stop){
            row=new String[3];
            bet=0;
            choice="";
            while(bet>balance || bet<=0){
                System.out.print("Enter your bet: ");
                bet=sc.nextInt();
            }
            balance=balance-bet;
            System.out.printf("Your current balance is $%d \n",balance);
            for (int i = 0; i < row.length; i++) {
                row[i]=emojis[r.nextInt(0, 3)];
                
            }
            System.out.println("*************");
            System.out.printf("| %s | %s | %s | \n",row[0],row[1],row[2]);
            System.out.println("*************");
            if (row[0].equalsIgnoreCase(row[1]) && row[1].equalsIgnoreCase(row[2]) ) {
                System.out.println("You Got 3 Matches!");
                balance+=100;
            }
            else if(row[0].equalsIgnoreCase(row[1]) || row[1].equalsIgnoreCase(row[2]) || row[0].equalsIgnoreCase(row[2])){
                System.out.println("You Got 2 Matches!");
                balance+=50;
            }
            System.out.println("Your new balance $"+balance);
            while(!choice.equalsIgnoreCase("N") && !choice.equalsIgnoreCase("Y")){
                System.out.print("Do you want to continue?");
                choice=sc.next();
            }
            if(choice.equalsIgnoreCase("N")){
                stop=true;
            }
        }
        
        System.out.println("Your final balance is $"+balance);

    }
}