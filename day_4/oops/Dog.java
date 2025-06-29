public class Dog extends Animal{
    int lives=1;

    void speak(){
        System.out.println("barks!!");
    }   
    
    @Override
    void move(){
        System.out.println("Dog is moving");
    }
}