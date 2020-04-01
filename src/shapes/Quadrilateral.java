package shapes;

//TODO: Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable. This class should have:
public abstract class Quadrilateral extends Shape implements Measurable {

    //TODO: protected properties for length and width.
    protected double length;
    protected double width;

    //TODO: a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral (double length, double width){
        this.length = length;
        this.width = width;
    }

    //TODO: methods for getting the length and width.
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //TODO: abstract methods for setting the length and width.
    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
