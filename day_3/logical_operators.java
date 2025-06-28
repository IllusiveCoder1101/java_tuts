import java.util.Scanner;
public class logical_operators{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        && - AND
        || - OR
        !  - NOT
        */
        /*
        double temp=-20.0;
        boolean isSunny=false;

        if(temp<=30 && temp>=0 && isSunny){
            System.out.println("It is sunny and weather is good");
        }
        else if (temp<=30 && temp>=0 && !isSunny) {
            System.out.println("It is cool outside");
        }
        else if(temp>30 || temp<0){
            System.out.println("The weather is bad");
        }
        */
        String username;

        System.out.print("Enter the username: ");
        username=sc.nextLine();

        if(username.length()>=4 && username.length()<=12){
            if(!username.contains(" ") && !username.contains("_")){
                System.out.println("Valid username");
            }
            else{
                System.out.println("The username contains spaces or underscore.");
            }
        }
        else{
            System.out.println("The username is within the character range.");
        }

    }
}