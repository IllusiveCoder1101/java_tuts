public class nested_if{
    public static void main(String[] args) {
        boolean isStudent=true,isSenior=true;
        double price=9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get senior discount of 20%");
                System.out.println("You get student discount of 10%");
                
                price*=0.7;        
            }
            else{
                System.out.println("You get student discount of 10%");
                price*=0.9;
            }
           
        }
        else{
            if(isSenior){
                System.out.println("You get senior discount of 20%");
                price*=0.8;        
            }
            else{
                price*=0.1;
            }
        }
        System.out.printf("The price of the ticket is $%.2f",price);
    }
}