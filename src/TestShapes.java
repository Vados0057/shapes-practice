
/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes {
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4
         */
        Rectangle rectangle = new Rectangle(5.5, 6);
        Square square = new Square(2.5);
        Circle circle = new Circle(4);

        /*
         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0
        */
        Shape[] shapes = {rectangle, square, circle};
        for (Shape s : shapes) {
            System.out.println(s + "\nArea of the " + s.getClass().getSimpleName() + " is = " + s.area()+
                    "\nPerimeter of the " + s.getClass().getSimpleName() + " is = " + s.perimeter() + "\n");
        }

        /*
         Circle has the largest area as 50.24
         */

        if (circle.area() > rectangle.area() && circle.area() > square.area()) System.out.println(
                "Circle has the largest area as " + circle.area());
        else if (rectangle.area() > circle.area() && rectangle.area() > square.area()) System.out.println(
                "Rectangle has the largest are as " + rectangle.area());
        else System.out.println("Square has the largest are as " + square.area());

    }
}
