public class printf{
    public static void main(String[] args) {
        String name="Sankalpa";
        char firstLetter='a';
        int age=30;
        double height=60000.5;
        boolean isEmployed=true;

        System.out.printf("Hello %10s \n",name);
        System.out.printf("First letter %-10c \n",firstLetter);
        System.out.printf("You are %10d years old\n",age);
        System.out.printf("You are %10.1f cms tall\n",height);
        System.out.printf("Employed %10b\n",isEmployed);
        System.out.printf("%s is %10d years old",name,age);
    }
}