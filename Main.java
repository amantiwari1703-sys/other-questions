public class Main {
    public static void main(String[] args) {
    Fan f=new Fan();
    f.start();
    f.stop();
    }
}
abstract class Machine{
    abstract void start();
    abstract void stop();
}
class Fan extends Machine{
    void start(){
        System.out.println("fan starts");
    }
    void stop(){
        System.out.println("fan stop");
    }
}