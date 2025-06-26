import java.util.Scanner;
public class temp_conv{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double temp,converted_temp;
        String unit,converted_unit;

        System.out.print("Enter the value of temperature:");
        temp=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the unit of temp(C for celcius, F for farenheit):");
        unit=sc.nextLine();

        converted_temp=(unit.equalsIgnoreCase("C"))?temp*(9/5)+32:(temp-32)*5/9;
        converted_unit=(unit.equalsIgnoreCase("C"))?"Farenheit":"Celcius";
        System.out.printf("The units in %s is %.2f degrees",converted_unit,converted_temp);
        sc.close();
    }
}