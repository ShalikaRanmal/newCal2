
import com.calculateArea.Calculator;
import com.calculateArea.circle;
import com.calculateArea.square;
import com.calculateArea.triangle;

public class Main {
    public static void main(String[] args) {

        Calculator square = new square(4,5);
        Calculator circle = new circle(4);
        Calculator triangle = new triangle(4,7);
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Area of triangle: " + triangle.calculateArea());

    }

}