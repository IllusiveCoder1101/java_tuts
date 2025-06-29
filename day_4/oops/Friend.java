public class Friend{
    String name;
    static int numoffriends;
    public Friend(String name) {
        this.name=name;
        numoffriends+=1;
    }
    static void showFriends(){
        System.out.println("You have "+numoffriends+" friend(s).");
    }

    
}