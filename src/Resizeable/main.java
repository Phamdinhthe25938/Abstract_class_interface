package Resizeable;

public class main {
    public static void main(String[] args) {
        Shape [] shape = new Shape[3];
        shape[0]= new Circle(4);
        shape[1]= new Rectangle(5,6);
        shape[2]= new Square(2);
        double ramdom = Math.random()*100+1;
        for (Shape s:shape) {
            if(s instanceof Circle){
                System.out.println(s);
                ((Circle)s).reSize(ramdom);
                System.out.println(s);
            } else if (s instanceof Rectangle) {
                System.out.println(s);
                ((Rectangle)s).reSize(ramdom);
                System.out.println(s);
            } else if (s instanceof Square){
                System.out.println(s);
                ((Square)s).reSize(ramdom);
                System.out.println(s);
            }
        }
    }
}
