import java.util.Random;
public class random{
    public static void main(String[] args) {
        Random r=new Random();

        int number;
        double number1;
        boolean isHead;
        number=r.nextInt();
        number1=r.nextDouble();
        isHead=r.nextBoolean();
        System.out.println(number);
        System.out.println(number1);
        if(isHead){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}