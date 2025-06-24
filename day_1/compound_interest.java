import java.util.Scanner;
public class compound_interest{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        double principal,rate,compoundInterest=0.0;
        int timesCompounded,years;

        System.out.println("Enter the principal: ");
        principal=sc.nextDouble();
        System.out.println("Enter the rate: ");
        rate=sc.nextDouble() / 100;
        
        System.out.println("Enter the times compounded: ");
        timesCompounded=sc.nextInt();
        System.out.println("Enter the no of years: ");
        years=sc.nextInt();

        compoundInterest=principal*Math.pow(1+rate/timesCompounded,timesCompounded*years);

        System.out.printf("The compound Interset is $%,.3f",compoundInterest);
        
        
    }
}