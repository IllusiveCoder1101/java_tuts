public class Student extends Person{

    double gpa;

    public Student(String first,String last,double gpa) {
        super(first,last);
        this.gpa=gpa;
    
    }
    void showGPA(){
        System.out.println(this.gpa);
    }
    @Override
    public String toString(){
        return "Hello, I'm a student."; 
    }
    
}