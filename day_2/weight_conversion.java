import java.util.Scanner;
public class weight_conversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String unit;
        double weight,converted_weight;
        System.out.println("Enter the weight:");
        weight=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the unit (lb for pounds and kg for kilogram)");
        unit=sc.nextLine();

        if(unit.equalsIgnoreCase("lb") || unit.equalsIgnoreCase("kg")){
            if(unit.equalsIgnoreCase("lb")){
                converted_weight=weight*0.45359237;
                System.out.printf("Your weight in kilograms is %.2f kg(s)",converted_weight);
            }
            else{
                converted_weight=weight*2.2046;
                System.out.printf("Your weight in Pounds is %.2f lb(s)",converted_weight);
                
            }
        }
        else{
            System.out.println("Enter a valid unit");
        }
        sc.close();
    }
}