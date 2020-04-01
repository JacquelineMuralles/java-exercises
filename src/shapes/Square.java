package shapes;


public class Square extends Quadrilateral {
//    protected int side;//property allows you to use this.side = side;

    public Square(double length){
        super(length, length);
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(double width) {
        setLength(length);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }


//    //TODO: Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//    public Square(int side){
//        super(side, side);
//
//        this.side = side;//allows you to use side in the override
//    }
//
//
//    //TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square.
//
//    @Override
//    public int getArea(){
//        System.out.println("override");
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter(){
//        System.out.println("override");
//        return 4 * side;
//    }


}
