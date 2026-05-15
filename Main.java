public class Main {
    public static void main(String[] args) {
       Outer o=new Outer();
       Outer.inner i=o.new inner();
       i.display();


    }
}
class Outer {
    int x = 10;

    class inner {
        void display() {
            System.out.println(x);

        }
    }
}
