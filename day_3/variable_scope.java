public class variable_scope{
    
    static int x=3; // GLOBAL
    public static void main(String[] args) {
        int x=1; // LOCAL
        System.out.println(x);
    }

    static void something(){
        int x=2; //LOCAL
    }
}