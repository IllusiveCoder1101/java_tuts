public class method{
    public static void main(String[] args) {
        System.out.println(squared(3));        
    }

    static double squared(double n){
        return n*n;
    }
    static void happy_birthday(String name,int age){
        System.out.printf("Happy Birthday to %s! \n",name);
        System.out.printf("You are %d years old \n",age);
    }
}