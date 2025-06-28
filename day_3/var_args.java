public class var_args{
    public static void main(String[] args) {
        add(1,2,3,4);
    }
    static void add(int... numbers){
        int total=0;
        for(int number:numbers){
            System.out.println(number);
            total+=number;
        }
        System.out.println(total);
    }
}