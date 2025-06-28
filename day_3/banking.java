import java.util.Scanner;
public class banking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        double balance=0.0;
        boolean stop=false;
        while(!stop){
            System.out.println("\n***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();

            switch (choice) {
                case 1 -> System.out.printf("Your balance contains $%.2f",balance);
                case 2 -> balance = deposit(balance);
                case 3 -> balance = withdraw(balance);
                case 4 -> stop=true;
                default -> System.out.print("Wrong Choice");
                    
            }
        }
    }
    static double deposit(double balance){
        
        Scanner sc = new Scanner(System.in);
        
        double amt_to_deposit;
        System.out.print("Enter the amount to be deposited: ");
        amt_to_deposit=sc.nextDouble();
        return balance+amt_to_deposit;
    }
     static double withdraw(double balance){
        
        Scanner sc = new Scanner(System.in);
        
        double amt_to_withdraw;
        System.out.print("Enter the amount to be withdrawn: ");
        amt_to_withdraw=sc.nextDouble();
        
        if(balance>0){
            return balance-amt_to_withdraw;
        }
        else{
            System.out.print("You have no money to withdraw");
            return 0;
        }
    }
}