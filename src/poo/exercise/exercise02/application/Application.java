package poo.exercise.exercise02.application;

import java.util.Locale;
import java.util.Scanner;
import poo.exercise.exercise02.domain.Rectangle;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");

        System.out.print("Width: ");
        rectangle.setWidth(sc.nextDouble());

        System.out.print("Height: ");
        rectangle.setHeight(sc.nextDouble());

        System.out.printf("Area = %.2f\n", rectangle.area());
        System.out.printf("Perimeter = %.2f\n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f\n", rectangle.diagonal());
    }
}
