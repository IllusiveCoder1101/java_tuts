public class Students{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    public Students(String name,int age,double gpa,boolean isEnrolled) {
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        this.isEnrolled=isEnrolled;
    
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }

    
}