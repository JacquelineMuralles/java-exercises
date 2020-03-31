package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input userNum = new Input();
        System.out.println("Please enter the radius of your circle: ");

        Circle shapeOne = new Circle(userNum.getDouble());
        System.out.println(Circle.circleCounter);
        System.out.println(shapeOne.getArea());


    }
}
