public class overloaded_methods{
    public static void main(String[] args) {
        System.out.println(add(1.0,2.0,3.0));
    }

    static double add(double a, double b){
        return a+b;
    }
    
    static double add(double a, double b,double c){
        return a+b+c;
    }
}