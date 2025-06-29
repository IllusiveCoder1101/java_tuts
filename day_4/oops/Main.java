public class Main{
    public static void main(String[] args) {
       
        // CLASSES AND OBJECTS
        Car c=new Car();
        System.out.println(c.isRunning);
        c.Start();
        System.out.println(c.isRunning);
        c.Stop();
        System.out.println(c.isRunning);
        
        // CLASSES WITH CONSTRUCTORS
        Students s=new Students("Sankalpa",19,3.4,false);
        Students s1=new Students("Ram",29,4.0,true);
        s.display();
        s1.display();
        

        // CLASSES WITH OVERLOADED CONSTRUCTORS
        Users u=new Users("Sankalpa");
        Users u1=new Users("Ram","ram@gmail.com");
        Users u2=new Users(12);

        u.display();
        u1.display();
        u2.display();
        
       // ARRAY OF OBJECTS
       Students[] classroom={s,s1};

       for(Students a:classroom){
        a.display();
       }
       
       // STATIC VARIABLES & METHODS 

       Friend f1=new Friend("Sankalpa");
       Friend f2=new Friend("Patrick");
        System.out.println(Friend.numoffriends);
        Friend.showFriends();


        // INHERITANCE

        Dog d=new Dog();
        System.out.println(d.isAlive);
        d.eat();
        d.speak();

        Plants p=new Plants();
        System.out.println(p.isAlive);
        p.Synthesize();

        
        // SUPER 

        Student s2=new Student("Ram","Pal",4.0);
        s2.showName();
        s2.showGPA();

        // METHOD OVERRIDING

        d.move();

        //.toString() Method

        System.out.println(s2);

    }
}