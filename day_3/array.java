import java.util.Arrays;
public class array{
    public static void main(String[] args) {
        String[] vegies={"cucumber","tomato","brinjal"};

        System.out.println(vegies[0]);
        vegies[1]="potato";
        System.out.println(vegies[1]);
        System.out.println(vegies.length);
        Arrays.sort(vegies);
        for(int i=0;i<vegies.length;i++){
            System.out.println(vegies[i]);
        }
        Arrays.fill(vegies,"aloo");
        for(String veg:vegies){
            System.out.println(veg);
        }
    }
}