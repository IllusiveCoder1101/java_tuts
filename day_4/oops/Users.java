public class Users{
    String username;
    String email;
    int age;

    public Users(String username) {
        this.username=username;
        this.email="Not provided";
        this.age=0;
    }
    public Users(String username,String  email) {
        this.username=username;
        this.email=email;
        this.age=0;
    }
    public Users(int age) {
        this.age=age;
        this.username="Not provided";
        this.email="Not provided";
    }

    void display(){
        System.out.println(this.username);
        System.out.println(this.email);
        System.out.println(this.age);
    }
    
}