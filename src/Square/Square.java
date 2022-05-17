package Square;

public class Square extends Shape implements Colorable {
    private int side;
    public Square(){

    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public void getArea(){
        System.out.println("dien tich :"+getSide()*getSide());
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
