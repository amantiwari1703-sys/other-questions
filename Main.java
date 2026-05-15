public class Main {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.inner i=new Outer.inner();
        i.show();
    }
    }
    class Outer{
    static class inner{
        void show(){
            System.out.println("static inner method");
        }
    }
    }