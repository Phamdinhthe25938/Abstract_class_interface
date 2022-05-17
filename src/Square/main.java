package Square;

public class main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0]= new Circle(4);
        shape[1]= new Rectangle(5,6);
        shape[2]= new Square(2);
        for(Shape s :shape){
            if(s instanceof Square){
                System.out.println("hinh vuong co canh :"+((Square) s).getSide());
                ((Square) s).getArea();
                ((Square) s).howToColor();
            }
        }
    }
}
