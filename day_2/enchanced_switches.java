public class enchanced_switches{
    public static void main(String[] args) {
        String day="Monday";

        switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It's a weekday");
            case "Saturday","Sunday" -> System.out.println("It's a weekend");
            default -> System.out.println("Invalid day name:"+day);
        }
    }
}