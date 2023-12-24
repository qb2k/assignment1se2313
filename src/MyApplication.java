import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\IDE projects\assignment1se2313-main\src\source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        // Test
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side: " + shape.getLongest());
        System.out.println("Average Side: " + shape.averageSide())
    }
}
