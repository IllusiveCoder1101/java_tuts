public class variables{
    public static void main(String[] args) {
        String name="Sankalpa Sarkar";
        int gta=6;
        double pi=3.14159;
        char gender='M';
        boolean isAdmin=true;

        System.out.println("Hello "+name+" you just purchased gta"+gta);
        System.out.println("The first 5 decimal values of pi: "+pi);
        System.out.println("You are: "+gender);

        if(isAdmin){
            System.out.println("You are an Admin");
        }
        else{
            System.out.println("You are not an Admin");
        }
    }
}