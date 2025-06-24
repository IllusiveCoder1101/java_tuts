import java.util.Scanner;
public class input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double length,breadth,area=0;

        System.out.println("Enter length");
        length=sc.nextDouble();
        
        System.out.println("Enter breadth");
        breadth=sc.nextDouble();

        area=length*breadth;

        System.out.println("The rectangle of dimensions "+length+"x"+breadth+" is of area: "+area);

        sc.close();
    }
}