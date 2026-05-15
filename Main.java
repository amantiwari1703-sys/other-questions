public class Main {
    public static void main(String[] args){
Circle s=new Circle();
s.draw();
    }
}
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

