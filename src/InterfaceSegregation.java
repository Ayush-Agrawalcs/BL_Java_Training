interface Shape2D{
    void area();
}
interface  Shape3D{
    void area();
    void volume();
}

class Rectangle implements Shape2D{
    public void area(){
        System.out.println("Print rectangle area");
    }
}
class Circle implements Shape2D{
    public void area(){
        System.out.println("Print rectangle area");
    }
}
class Square implements Shape3D{
    public void area(){
        System.out.println("Print Square area");
    }
    public void volume(){
        System.out.println("print Square Volume");
    }
}
class Cube implements Shape3D{
    public void area(){
        System.out.println("Print cube area");
    }
    public void volume(){
        System.out.println("Print Cube volume");
    }
}
public class InterfaceSegregation {
    public static void main(String[] args) {
        Shape2D sh=new Rectangle();
        sh.area();;
        Shape3D sh1=new Cube();
        sh1.area();
        sh1.volume();
    }
}
