public class array_search{
    public static void main(String[] args) {
        String[] fruits={"apple","banana","cherries","pineapple"};
        String target="apple";
        boolean isFound=false;

        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equalsIgnoreCase(target)){
                System.out.println("Element found at: "+i);
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found");
        }
    }
}