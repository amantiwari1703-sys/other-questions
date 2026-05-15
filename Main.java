public class Main {
    public static void main(String[] args) {
   Car c=new Car();
   c.start();
   c.run();
    }
}
abstract class Vehicle{
    void start(){
        System.out.println("vehicle starts");
    }
    abstract  void run();
}
class Car extends Vehicle{
    void run(){
        System.out.println("car runs");

    }
}