package shapes;

public class Circle {//name of object
    private double radius;//property object
    public static int circleCounter;

    public Circle (double radius){//constructor
        this.radius = radius;
        System.out.println("new circle created");
        circleCounter++;
    }

    public double getArea(){//method
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){//method
        return 2 * Math.PI * radius;
    }

}

