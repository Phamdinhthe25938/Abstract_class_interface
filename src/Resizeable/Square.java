package Resizeable;

public class Square extends Rectangle {
    private double side ;
    public Square(){

    }

    public Square(int side) {
        this.side = side;
    }

    public Square(String color, boolean filled, int side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void reSize(double percent) {
        this.setSide(percent);
    }

    public void setSide(double side) {
       this.side=side;
    }
    @Override
    public String toString() {
        return "A Square with" +
                "side=" + getSide() +
                ", which is a subclass of "+
                super.toString()+
                '}';
    }
}
