package shapes;

//************************************************PART TWO***********************************************************
//TODO: Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
 public class Rectangle extends Quadrilateral implements Measurable {
     public Rectangle (double length, double width) {
         super(length, width);
     }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
         this.width = width;

    }
    @Override
    public double getPerimeter () {
         return (length * width) * 2;
     }

     @Override
     public double getArea () {
         return length * width;
     }
     }

    //*******************************PART ONE***********************************************************************
//    //TODO: It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    //TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);

