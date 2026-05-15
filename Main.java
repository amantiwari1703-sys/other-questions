public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();

    }
}
abstract  class Person{
    Person(){
        System.out.println("constructor of person");
    }
    abstract void display();
}
class Student extends Person{
    void display(){
        System.out.println("students details");
    }
}