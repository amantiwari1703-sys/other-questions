public class Main {
    public static void main(String[] args) {
        Outer O=new Outer();
        Outer.inner i=O.new inner();

        i.show();

    }
}
class Outer{
    class inner{
        void show(){
            System.out.println("inner class method");
        }
    }
}